package com.main.features;

import com.codeborne.selenide.Configuration;


public class BaseTest {
    {
        Configuration.browser = System.getProperty("driver.browser");
    }
}
