package by.epamtc.lonelyday.tasks_01.task9.ui;

import by.epamtc.lonelyday.until.reporter.BaseReporter;

public class Task9Reporter extends BaseReporter {




    public static void reportLength(double length) {
        reportString("Circumference length:");
        reportString(String.valueOf(length));
    }

    public static void reportArea(double area) {
        reportString("Circumference area:");
        reportString(String.valueOf(area));
    }
}
