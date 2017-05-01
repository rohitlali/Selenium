package com.rohit.practice.reporting;

/**
 * Created by rohit on 02-May-17.
 */
public interface ReportGenerator {

    enum STATUS {
        SUCCESS, FAILURE, ERROR;
    }

    void startReporting();

    void startTestCase(String testCaseName, String description);

    void appendTestCaseProgress(STATUS status, String description);

    void endTestCase();

    void endReporting();
}
