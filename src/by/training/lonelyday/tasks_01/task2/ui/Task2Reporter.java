package by.training.lonelyday.tasks_01.task2.ui;

import by.training.lonelyday.until.reporter.BaseReporter;

public class Task2Reporter extends BaseReporter {


    public static void reportDaysNumber(int daysNumber) {
        reportString("Number of days:");
        reportString(String.valueOf(daysNumber));
    }


}
