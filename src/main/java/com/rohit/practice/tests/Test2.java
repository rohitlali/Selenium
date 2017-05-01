package com.rohit.practice.tests;

import com.rohit.practice.reporting.ReportGenerator;
import com.rohit.practice.reporting.ReportingInstance;
import com.rohit.practice.reporting.ReportingWrapper;
import org.testng.annotations.*;

/**
 * Created by rohit on 02-May-17.
 */
public class Test2 {

    protected ReportingInstance reportingInstance;

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
        reportingInstance = ReportingWrapper.INSTANCE.generateReportingInstance();
        reportingInstance.startReporting();
        System.out.println("beforeMethod2");
    }

    @Test
    public void test1() {
        reportingInstance.startTestCase("21", "");
        System.out.println("test21");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS, "21.1");
    }

    @Test
    public void test2() {
        reportingInstance.startTestCase("22", "");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS, "22.1");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS, "22.1");
        System.out.println("test22");
    }

    @AfterMethod
    public void afterMethod() {
        reportingInstance.endTestCase();
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