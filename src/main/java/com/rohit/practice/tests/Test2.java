package com.rohit.practice.tests;

import org.testng.annotations.*;

/**
 * Created by rohit on 02-May-17.
 */
public class Test2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass2");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod2");
    }

    @Test
    public void test1() {
        System.out.println("test21");
    }

    @Test
    public void test2() {
        System.out.println("test22");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod2");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass2");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("afterSuite2");
    }
}