package com.rohit.practice.tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.rohit.practice.reporting.ReportGenerator;
import com.rohit.practice.reporting.ReportingInstance;
import com.rohit.practice.reporting.ReportingWrapper;
import org.testng.annotations.*;

import java.io.File;

/**
 * Created by rohit on 02-May-17.
 */
public class Test1 {

    protected ReportingInstance reportingInstance;

    @BeforeSuite
    public void beforeSuite () {
        System.out.println();
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
        reportingInstance = ReportingWrapper.INSTANCE.generateReportingInstance();
        reportingInstance.startReporting();
        System.out.println("beforeMethod1");
    }

    @Test
    public void test1 () {
        reportingInstance.startTestCase("11","");
        System.out.println("test11");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS,"11.1");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS,"11.2");
    }

    @Test
    public void test2 () {
        reportingInstance.startTestCase("12","");
        System.out.println("test12");
        reportingInstance.appendTestCaseProgress(ReportGenerator.STATUS.SUCCESS,"12.1");
    }

    @AfterMethod
    public void afterMethod () {
        reportingInstance.endTestCase();
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
        reportingInstance.endReporting();
    }
}