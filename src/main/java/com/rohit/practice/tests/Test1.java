package com.rohit.practice.tests;

import org.testng.annotations.*;

/**
 * Created by rohit on 02-May-17.
 */
public class Test1 {

    @BeforeSuite
    public void beforeSuite () {
        System.out.println("beforeSuite1");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass1");
    }

    @BeforeTest
    public void beforeTest () {
        System.out.println("beforeTest1");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("beforeMethod1");
    }

    @Test
    public void test1 () {
        System.out.println("test11");
    }

    @Test
    public void test2 () {
        System.out.println("test12");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("afterMethod1");
    }

    @AfterTest
    public void afterTest () {
        System.out.println("afterTest1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass1");
    }

    @AfterSuite
    public void AfterSuite () {
        System.out.println("afterSuite1");
    }
}