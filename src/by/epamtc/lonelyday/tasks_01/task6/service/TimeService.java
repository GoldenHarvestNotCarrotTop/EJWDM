package by.epamtc.lonelyday.tasks_01.task6.service;

public class TimeService {
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int HOURS_IN_DAY = 24;
    public static final int SECONDS_IN_DAY = HOURS_IN_DAY*SECONDS_IN_HOUR;

    public static int getHoursBySeconds(int seconds) {
        return seconds / SECONDS_IN_HOUR;
    }

    public static int getMinutesBySeconds(int seconds) {
        return seconds / SECONDS_IN_MINUTE;
    }
}
