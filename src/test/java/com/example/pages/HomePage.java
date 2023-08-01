package com.example.pages;

import com.example.utlis.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();

   //@FindBy(name ="q")
   @FindBy(xpath = "//*[@id='shopify-section-header']/store-header/div[2]/div[1]/div/div/label/input")
    private WebElement  searchData;

   @FindBy(css = "button[is='toggle-button']")
   private WebElement navigation;

   //@FindBy(css = "p[text()=Neckbands]")
   @FindBy(xpath = "//*[@id='mobile-menu-1']/ul/li[2]/a/div/img")
   private WebElement neckbands;


    @FindBy(xpath = "//*[@id='shopify-section-header']/store-header/div[1]/div/div/div/div[3]/span/img")
    private WebElement profile;

    @FindBy(css = "a[href='/account/login']")
    private WebElement login;

   // @FindBy(xpath = "/html/body/div[3]/store-header/div[1]/div/div/div/a/svg/path")
   @FindBy(css = "svg[viewBox='0 0 21.002 23.5']")
    private WebElement cart;

   @FindBy(xpath = "//*[contains(text(),'Start shopping')]")
   private WebElement shopping;

    @FindBy(css = "img[alt='Aman Gupta boAt']")
    private WebElement blog;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigation() throws InterruptedException {
        driver.get(baseUrl);
        navigation.click();
        neckbands.click();

    }

    public void search() throws InterruptedException {
        driver.get(baseUrl);
        searchData.sendKeys("watches");
    }

    public void profile(){
        driver.get(baseUrl);
        profile.click();
        login.click();
    }

    public void cart() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(5000);
        cart.click();

        shopping.click();
    }

    public void blog() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(10000);
        blog.click();
    }

}