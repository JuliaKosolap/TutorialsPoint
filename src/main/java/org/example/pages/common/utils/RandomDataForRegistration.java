package org.example.pages.common.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataForRegistration {

    public static String randomEmail() {
        String email = "TestEmail" + System.nanoTime() + "@gmail.com";
        return email;
    }

    public static String invalidRandomEmail() {
        String email = RandomStringUtils.randomAlphanumeric(10);
        return email;
    }

    public static String fistName() {
        String firstName = RandomStringUtils.randomAlphabetic(10);
        return firstName;
    }

    public static String lastName() {
        String lastName = RandomStringUtils.randomAlphabetic(10);
        return lastName;
    }
}

