package org.example.test;
import com.codeborne.selenide.Selenide;
import org.example.pages.HomePage;
import org.example.pages.NavigationMenu;
import org.testng.Assert;
import org.testng.annotations.*;


public class NavigateToUnixPageTest {

    @Test
    public void navigateToUnixPage() {
        HomePage homePage = new HomePage();
        homePage.closeCookiesDialog();
        NavigationMenu navMenu = new NavigationMenu();
        navMenu.goToUnixPage();
        Assert.assertEquals(Selenide.$("h1").getText(), "Linux/Unix Tutorial");
    }
}
