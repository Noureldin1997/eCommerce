package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user presses at search")
    public void user_Presses_At_search(){
        home.searchInput().click();
    }
    @When("user enters {string} in search")
    public void user_enters_name_in_search(String string){
        home.searchInput().clear();
        home.searchInput().sendKeys(string);
    }
    @When("presses on the search button")
    public void presses_on_the_search_button(){
        home.searchBtn().click();
    }
    @Then("user could search using name successfully")
    public void user_could_search_using_name_successfully(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertTrue(home.searchProductsList().size()>0);
        soft.assertAll();
    }
    @When("user clicks on the product in search result")
    public void user_clicks_on_the_product_in_search_result(){
        home.searchProduct().click();
    }
    @Then("user could search using {string} successfully")
    public void user_could_search_using_SKU_successfully(String string){
        Assert.assertTrue(home.SKU().getText().contains(string));
    }
}
