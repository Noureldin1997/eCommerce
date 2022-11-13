package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    @When("user chooses currency")
    public void user_chooses_currency(){
        home.currency().click();
        home.Euro().click();
    }
    @Then("the Euro sign is visible")
    public void the_Euro_sign_is_visible(){
        List<WebElement> products = home.products();
        List<WebElement> prices = home.prices();
        for (int i = 0; i < products.size(); i++){
            Assert.assertTrue(prices.get(i).getText().contains("€"));
        }
    }
}
