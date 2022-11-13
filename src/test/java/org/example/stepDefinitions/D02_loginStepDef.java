package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();
    @Given("user go to login page")
    public void user_go_to_login_page() {
        login.loginBtn().click();
    }
    @When("user login with {string} {string} and {string}")
    public void user_login_with_and(String string, String string2, String string3) {
        login.email().sendKeys(string2);
        login.password().sendKeys(string3);
    }
    @When("user press on login button")
    public void user_press_on_login_button() {
        login.login().click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","The url does not match the home page URL");
        soft.assertTrue(login.loginRight().isDisplayed(),"the login message is not displayed");
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.loginWrong().isDisplayed(),"the wrong login message is not displayed");
        String expectedColor = "rgba(228, 67, 75, 1)";
        String actualColor = login.loginWrong().getCssValue("color");
        soft.assertEquals(actualColor,expectedColor);
        soft.assertAll();
    }
}
