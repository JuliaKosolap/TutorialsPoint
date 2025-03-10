package org.example.test;

import org.example.common.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static org.example.pages.common.Props.*;

public class BaseTest {

    @BeforeSuite
    public void setUp() throws IOException {
        initProperties();
        DriverManager.setUp();
    }

    @BeforeTest
    public void testSetUp() {
        open(siteUrl);
    }

    @AfterTest
    public void tearDown() {
        resetProperties();
    }
}
