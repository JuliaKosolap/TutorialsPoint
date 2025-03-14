package org.example.pages;

public class NavigationMenu {
    NavigationMenuLocators locators = new NavigationMenuLocators();

    public void goToUnixPage() {
        expandCategoriesMenuItem();
        expandDevOpsMenuItem();
        locators.unixMenuItem.click();
    }

    public void expandCategoriesMenuItem() {
        locators.categoryNavItem.click();
    }

    public void expandDevOpsMenuItem() {
        locators.devOpsMenuItem.click();
    }
}
