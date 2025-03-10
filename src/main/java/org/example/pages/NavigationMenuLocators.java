package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class NavigationMenuLocators {
    SelenideElement categoryNavItem = $("[aria-controls='category']");
    SelenideElement devOpsMenuItem = $(byText("DevOps"));
    SelenideElement unixMenuItem = $(linkText("UNIX"));
}
