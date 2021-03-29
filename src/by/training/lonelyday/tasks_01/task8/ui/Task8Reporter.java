package by.training.lonelyday.tasks_01.task8.ui;

import by.training.lonelyday.until.reporter.BaseReporter;

public class Task8Reporter extends BaseReporter {


    public static void reportResult(double result) {
        reportString("F(x) is:");
        reportString(String.valueOf(result));
    }

}
