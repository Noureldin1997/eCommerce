package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currency(){return Hooks.driver.findElement(By.id("customerCurrency"));}
    public WebElement Euro(){return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));}
    public List<WebElement> products(){return Hooks.driver.findElements(By.className("product-grid"));}
    public List<WebElement> prices(){return Hooks.driver.findElements(By.className("actual-price"));}
    public WebElement searchInput(){return Hooks.driver.findElement(By.id("small-searchterms"));}
    public WebElement searchBtn(){return Hooks.driver.findElement(By.className("search-box-button"));}
    public List<WebElement> searchProductsList(){return Hooks.driver.findElements(By.className("item-grid"));}
    public WebElement searchProduct(){return Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));}
    public WebElement SKU() {return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));}
    public WebElement electronicsCategoryList(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));}
    public WebElement cellPhonesSubCategoryList(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]"));}
    public WebElement pageTitleSub() {return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));}
    public WebElement nokiaSlider() {return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));}
    public WebElement iphoneSlider() {return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));}
    public WebElement sliderNumber(int sliderNumber){return Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]"));}
    public WebElement iconFollowUs(String string){return Hooks.driver.findElement(By.className(string));}
    public List<WebElement> addWishlist() {return Hooks.driver.findElements(By.className("add-to-wishlist-button"));}
    public WebElement wishlistSuccess() {return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));}
    public WebElement countWatchlist(){return Hooks.driver.findElement(By.className("wishlist-qty"));}
}
