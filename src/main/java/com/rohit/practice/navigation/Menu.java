package com.rohit.practice.navigation;

/**
 * Created by rohit on 07-May-17.
 */
public enum Menu {

    HOME, TUTORIALS ("RUBY","JAVA"), PRACTICE ("VIDEOS", "Demo Sites");

    public enum SubMenu {
        RUBY, JAVA, Videos, DemoSites;
    }

    private Menu() {

    }

    private Menu(String... menus) {

    }
}
