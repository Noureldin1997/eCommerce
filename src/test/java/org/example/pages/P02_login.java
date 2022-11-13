package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginBtn(){ return Hooks.driver.findElement(By.className("ico-login"));}
    public WebElement email(){ return Hooks.driver.findElement(By.id("Email"));}
    public WebElement password(){ return Hooks.driver.findElement(By.id("Password"));}
    public WebElement login(){ return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));}
    public WebElement loginRight() {return Hooks.driver.findElement(By.className("ico-account"));}
    public WebElement loginWrong() {return Hooks.driver.findElement(By.className("message-error"));}
}
