package com.rohit.practice.navigation;

import static com.rohit.practice.navigation.Menu.SubMenu.*;

/**
 * Created by rohit on 07-May-17.
 */
public enum Menu {

    HOME, TUTORIALS(RUBY, JAVA), PRACTICE(VIDEOS, DEMO_SITES);

    private SubMenu[] subMenus;

    public enum SubMenu {
        RUBY("Ruby"), JAVA("Java"), VIDEOS("Videos"), DEMO_SITES("Demo Sites");

        private String name;

        SubMenu() {

        }

        SubMenu(String name) {
            this.name = name;
        }
    }

    private Menu() {

    }

    private Menu(SubMenu... subMenus) {
        this.subMenus = subMenus;
    }
}
