package org.example.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.example.pages.HomePage;
import org.example.pages.NavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.example.pages.common.Props.siteUrl;

public class NavigateToUnixPageTest {


    @Test
    public void navigateToUnixPage() {
        open(siteUrl);
        HomePage homePage = new HomePage();
        homePage.closeCookiesDialog();
        NavigationMenu navMenu = new NavigationMenu();
        navMenu.expandCategoriesMenuItem();
        navMenu.expandDevOpsMenuItem();
        navMenu.goToUnixPage();
        Assert.assertEquals(Selenide.$("h1").getText(), "Linux/Unix Tutorial");
    }
}
