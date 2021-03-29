package by.epamtc.lonelyday.tasks_01.task5.ui;

import by.epamtc.lonelyday.until.reporter.BaseReporter;

public class Task5Reporter extends BaseReporter {

    public static void reportBool(boolean b) {
        reportString(String.valueOf(b));
    }

}
