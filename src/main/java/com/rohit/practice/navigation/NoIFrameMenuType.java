package com.rohit.practice.navigation;

import org.openqa.selenium.WebDriver;

/**
 * Created by rohit on 07-May-17.
 */
public class NoIFrameMenuType implements MenuType {


    @Override
    public boolean switchToPage(WebDriver driver) {
        return true;
    }

    @Override
    public boolean switchToMenu(WebDriver driver) {
        return true;
    }
}
