package org.example.common;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static String pathToWebDriver;

    // Method to initialize WebDriver
    public static void setUp() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
        // Get ChromeOptions and Pass it to Selenide
        Configuration.browserCapabilities = getChromeOptions();

    }
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Maximize window
        options.addArguments("--remote-allow-origins=*");  // Avoid WebSocket connection issues
        options.setHeadless(false); //Disable headless mode
        return options;
    }
    }
