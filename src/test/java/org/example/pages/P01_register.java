package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement maleChoice() {return Hooks.driver.findElement(By.id("gender-male"));}
    public WebElement femaleChoice() {return Hooks.driver.findElement(By.id("gender-female"));}
    public WebElement firstNameInput() {return Hooks.driver.findElement(By.id("FirstName"));}
    public WebElement lastNameInput() {return Hooks.driver.findElement(By.id("LastName"));}
    public WebElement birthDay() {return Hooks.driver.findElement(By.name("DateOfBirthDay"));}
    public WebElement birthMonth() {return Hooks.driver.findElement(By.name("DateOfBirthMonth"));}
    public WebElement birthYear() {return Hooks.driver.findElement(By.name("DateOfBirthYear"));}
    public WebElement emailInput() {return Hooks.driver.findElement(By.id("Email"));}
    public WebElement passwordInput() {return Hooks.driver.findElement(By.id("Password"));}
    public WebElement confirmPasswordInput() {return Hooks.driver.findElement(By.id("ConfirmPassword"));}
    public WebElement registerButton() {return Hooks.driver.findElement(By.id("register-button"));}
    public WebElement resultMsg() {return Hooks.driver.findElement(By.className("result"));}
}

