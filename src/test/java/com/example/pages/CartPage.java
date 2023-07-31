package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends  BasePage{

    @FindBy(css = "img[alt=' Airdopes 141 ']")
    private WebElement addCart;

    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void add(){
        addCart.click();

    }
}
