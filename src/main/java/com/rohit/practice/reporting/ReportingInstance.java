package com.rohit.practice.reporting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit on 02-May-17.
 */
public class ReportingInstance implements ReportGenerator {

    private ReportGenerator extentReportGenerator = new ExtentReportGenerator();
    private List<ReportGenerator> reportGenerators = new ArrayList<>();

    protected ReportingInstance() {
        reportGenerators.add(extentReportGenerator);
    }

    @Override
    public void startReporting() {
        reportGenerators.forEach(ReportGenerator::startReporting);
    }

    @Override
    public void startTestCase(String testCaseName, String description) {
        reportGenerators.forEach(idx -> idx.startTestCase(testCaseName, description));
    }

    @Override
    public void appendTestCaseProgress(STATUS status, String description) {
        reportGenerators.forEach(idx -> idx.appendTestCaseProgress(status, description));
    }

    @Override
    public void endTestCase() {
        reportGenerators.forEach(ReportGenerator::endTestCase);
    }

    @Override
    public void endReporting() {
        reportGenerators.forEach(ReportGenerator::endReporting);
    }
}