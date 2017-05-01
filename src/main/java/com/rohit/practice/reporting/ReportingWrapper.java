package com.rohit.practice.reporting;

/**
 * Created by rohit on 02-May-17.
 */
public enum ReportingWrapper {
    INSTANCE;

    public synchronized ReportingInstance generateReportingInstance() {
        return new ReportingInstance();
    }
}
