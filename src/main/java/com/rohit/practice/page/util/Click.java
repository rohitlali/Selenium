package com.rohit.practice.page.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rohit on 07-May-17.
 */
public class Click {

    public static void on(WebDriver driver, By selector) {
        driver.findElement(selector).click();
    }
}
