package com.rohit.practice.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rohit on 07-May-17.
 */
public class IFrameMenuType implements MenuType {

    @Override
    public boolean switchToPage(WebDriver driver) {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@frameborder='0']")));
        return true;
    }

    @Override
    public boolean switchToMenu(WebDriver driver) {
        driver.switchTo().parentFrame();
        return false;
    }
}
