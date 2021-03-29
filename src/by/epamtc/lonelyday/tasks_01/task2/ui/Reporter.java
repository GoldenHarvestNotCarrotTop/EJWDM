package by.epamtc.lonelyday.tasks_01.task2.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Reporter extends BaseReporter {


    public static void reportDaysNumber(int daysNumber) {
        reportString("Number of days:");
        reportString(String.valueOf(daysNumber));
    }


}
