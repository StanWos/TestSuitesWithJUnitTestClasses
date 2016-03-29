package com.main.features;

import com.codeborne.selenide.Configuration;

/**
 * Created by stan on 29.03.16.
 */
public class BaseTest {
    {
        Configuration.browser = System.getProperty("driver.browser");
    }
}
