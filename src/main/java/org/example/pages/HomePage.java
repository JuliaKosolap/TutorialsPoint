package org.example.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends NavigationMenu{

    public void closeCookiesDialog() {
        $("#ez-accept-all").should(Condition.visible).click();
    }
}
