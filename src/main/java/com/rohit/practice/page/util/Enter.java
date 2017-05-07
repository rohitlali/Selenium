package com.rohit.practice.page.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rohit on 07-May-17.
 */
public class Enter {

    public static void textInto(WebDriver driver, String text, By selector) {
        driver.findElement(selector).sendKeys(text);
    }
}
