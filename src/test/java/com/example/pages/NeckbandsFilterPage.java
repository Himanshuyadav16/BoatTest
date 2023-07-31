package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NeckbandsFilterPage extends  BasePage{

    @FindBy(css = "button[type='submit']")
    private WebElement filter;

    @FindBy(xpath = "//*[contains(text(),'Black ')]")
    private WebElement black;

    @FindBy(xpath = "//*[contains(text(),'Apply Filter')]")
    private WebElement applyFilter;

    public NeckbandsFilterPage(WebDriver driver){
        super(driver);
       PageFactory.initElements(driver,this);
    }

    public void filters() throws InterruptedException {
       Thread.sleep(3000);
        filter.click();
        black.click();
        applyFilter.click();


    }


}
