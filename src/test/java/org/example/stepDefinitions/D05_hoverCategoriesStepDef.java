package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();
    String subCategoryLowerCase;
    @When("user hovers electronics category")
    public void user_hovers_electronics_category() throws InterruptedException {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(home.electronicsCategoryList()).perform();
        subCategoryLowerCase = home.cellPhonesSubCategoryList().getText().toLowerCase();
        Thread.sleep(2000);
    }
    @When("user selects Cell phones sub-category")
    public void user_selects_Cell_phones_subcategory(){
        home.cellPhonesSubCategoryList().click();
    }
    @Then("user should go to the sub category page successfully")
    public void user_should_go_to_the_sub_category_page_successfully(){
        Assert.assertEquals(home.pageTitleSub().getText().toLowerCase(),subCategoryLowerCase);
    }
}
