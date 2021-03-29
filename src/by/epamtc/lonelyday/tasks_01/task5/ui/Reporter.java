package by.epamtc.lonelyday.tasks_01.task5.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Reporter extends BaseReporter {

    public static void reportBool(boolean b) {
        reportString(String.valueOf(b));
    }

}
