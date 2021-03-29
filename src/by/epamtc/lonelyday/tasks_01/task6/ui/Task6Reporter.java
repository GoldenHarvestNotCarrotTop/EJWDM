package by.epamtc.lonelyday.tasks_01.task6.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Task6Reporter extends BaseReporter {

    public static void reportHours(int hours) {
        reportString("Number of full hours:");
        reportString(String.valueOf(hours));
    }

    public static void reportMinutes(int minutes) {
        reportString("Number of full minutes:");
        reportString(String.valueOf(minutes));
    }

    public static void reportSeconds(int seconds) {
        reportString("Number of full seconds:");
        reportString(String.valueOf(seconds));
    }
}
