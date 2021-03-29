package by.epamtc.lonelyday.tasks_01.task3.ui;

import by.epamtc.lonelyday.util.reporter.BaseReporter;

public class Task3Reporter extends BaseReporter {


    public static void reportSquareArea(double square) {
        reportString("Square area:");
        reportString(String.valueOf(square));
    }


}
