package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage();
    @When("user clicks on the nokia slider")
    public void user_clicks_on_the_nokia_slider(){
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        home.nokiaSlider().click();
        home.sliderNumber(1).click();
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    @Then("the user should be directed to the correct nokia product")
    public void the_user_should_be_directed_to_the_correct_nokia_product(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }
    @When("user clicks on the iphone slider")
    public void user_clicks_on_the_iphone_slider(){
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        home.iphoneSlider().click();
        home.sliderNumber(2).click();
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    @Then("the user should be directed to the correct iphone product")
    public void the_user_should_be_directed_to_the_correct_iphone_product(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }
}
