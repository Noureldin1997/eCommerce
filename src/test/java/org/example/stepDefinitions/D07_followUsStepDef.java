package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    P03_homePage home = new P03_homePage();
    @When("user opens {string} link")
    public void user_clicks_on_link(String string) {
        home.iconFollowUs(string).click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Then("{string} is opened in new tab")
    public void user(String string){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Hooks.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),string);
        Hooks.driver.close();
    }
}
