package by.training.lonelyday.tasks_01.task3.ui;

import by.training.lonelyday.until.reporter.BaseReporter;

public class Task3Reporter extends BaseReporter {


    public static void reportSquareArea(double square) {
        reportString("Square area:");
        reportString(String.valueOf(square));
    }


}
