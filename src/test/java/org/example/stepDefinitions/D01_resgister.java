package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_resgister {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        register.maleChoice().click();
    }

    @When("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String string, String string2) {
        register.firstNameInput().sendKeys(string);
        register.lastNameInput().sendKeys(string2);
    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select select = new Select(register.birthDay());
        select.selectByIndex(1);
        select = new Select(register.birthMonth());
        select.selectByIndex(7);
        select = new Select(register.birthYear());
        select.selectByValue("1950");
    }

    @When("user enter email {string} field")
    public void user_enter_email_field(String string) {
        register.emailInput().sendKeys(string);
    }

    @When("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String string, String string2) {
        register.passwordInput().sendKeys(string);
        register.confirmPasswordInput().sendKeys(string2);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.resultMsg().isDisplayed(),"result message is displayed");
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = register.resultMsg().getCssValue("color");
        soft.assertEquals(actualColor,expectedColor,"the color is correct");
        soft.assertTrue(register.resultMsg().getText().contains("Your registration completed"),"the result message text is correct");
        soft.assertAll();
    }
}
