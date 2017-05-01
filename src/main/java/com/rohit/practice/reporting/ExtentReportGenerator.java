package com.rohit.practice.reporting;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;

/**
 * Created by rohit on 02-May-17.
 */
class ExtentReportGenerator implements ReportGenerator {

    protected static final ExtentReports extentReports;

    static {
        extentReports = new ExtentReports("C:\\Rohit\\Code\\Practice\\Selenium\\Reports\\Test1.html", true);
        File extentConfig = new File("extent-config.xml");
        extentReports.loadConfig(extentConfig);
    }

    private ExtentTest extentTest;

    @Override
    public void startReporting() {
        // nothing for now
    }

    @Override
    public void startTestCase(String testCaseName, String description) {
        extentTest = extentReports.startTest(testCaseName, description);
    }

    @Override
    public void appendTestCaseProgress(STATUS status, String description) {
        extentTest.log(getLogStatus(status), description);
    }

    @Override
    public void endTestCase() {
        extentReports.endTest(extentTest);
    }

    @Override
    public void endReporting() {
        extentReports.flush();
        extentReports.close();
    }

    private LogStatus getLogStatus (STATUS status) {
        switch (status) {
            case SUCCESS:
                return LogStatus.PASS;
            case FAILURE:
                return LogStatus.FAIL;
            case ERROR:
                return LogStatus.ERROR;
            default:
                return null;
        }
    }
}