package org.example.pages;

public class NavigationMenu {
    NavigationMenuLocators locators = new NavigationMenuLocators();

    public void expandCategoriesMenuItem() {
        locators.categoryNavItem.click();
    }

    public void expandDevOpsMenuItem() {
        locators.devOpsMenuItem.click();
    }

    public void goToUnixPage() {
        locators.unixMenuItem.click();
    }
}
