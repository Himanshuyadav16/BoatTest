package com.example.testCases;

import com.example.BaseClass;
import com.example.pages.CartPage;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import com.example.pages.NeckbandsFilterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class boatTest extends BaseClass {

    @Test
    public void boatSearchTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.search();

    }

    @Test
    public void boatNavigationTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.navigation();

    }
    @Test
    public void neckbandFilterTest() throws InterruptedException{
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.navigation();
        NeckbandsFilterPage neckbandsFilterPage=new NeckbandsFilterPage(driver);
        neckbandsFilterPage.filters();
    }

    @Test
    public void boatProfileTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.profile();
        LoginPage page =new LoginPage(driver);
        page.loginPage();
    }
    @Test
    public void boatCartTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.cart();
        CartPage cartPage =new CartPage(driver);
        cartPage.add();
    }

    @Test
    public void boatBlogTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.blog();

    }
    }
