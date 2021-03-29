package by.epamtc.lonelyday.tasks_01.task3.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Reporter extends BaseReporter {


    public static void reportSquareArea(double square) {
        reportString("Square area:");
        reportString(String.valueOf(square));
    }


    public static void reportAreaRatio(double areaRatio) {
        reportString("Area ratio: ");
        reportString(String.valueOf(areaRatio));
    }
}
