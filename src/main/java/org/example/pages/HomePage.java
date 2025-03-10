package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends NavigationMenu{
    //SelenideElement acceptCookiesButton = $("#ez-accept-all");

    public void closeCookiesDialog() {
        $("#ez-accept-all").should(Condition.visible).click();
    }
}
