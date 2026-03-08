package com.company.analytics.hr;

public class HRAnalytics {
    public double attritionRate(int exits, int averageHeadcount) {
        if (averageHeadcount == 0) {
            return 0;
        }
        return (exits * 100.0) / averageHeadcount;
    }
}