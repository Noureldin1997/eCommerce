package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    P03_homePage home = new P03_homePage();
    @When("user adds a product to the wishlist")
    public void user_adds_a_product_to_the_wishlist(){
        home.addWishlist().get(2).click();
    }
    @Then("the corresponding product should be added to the wishlist")
    public void the_corresponding_product_should_be_added_to_the_wishlist(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(home.wishlistSuccess().isDisplayed(),"the success message is not displayed");
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = home.wishlistSuccess().getCssValue("background-color");
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }
    @Then("the number of items in the list is updated")
    public void the_number_of_items_in_the_list_is_updated(){
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String text = home.countWatchlist().getText().replaceAll("[^0-9]", "");
        int numberOfItems = Integer.parseInt(text);
        Assert.assertTrue(numberOfItems > 0);
    }
}
