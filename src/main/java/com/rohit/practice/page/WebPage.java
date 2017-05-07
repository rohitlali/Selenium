package com.rohit.practice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.Serializable;

/**
 * Created by rohit on 07-May-17.
 */
public abstract class WebPage<T extends UIMap> implements Serializable {

    protected WebDriver driver;

    public WebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, getClazz());
    }

    public abstract boolean isPageLoaded();

    public abstract <T extends WebPage<UIMap>> T getClazz ();

}
