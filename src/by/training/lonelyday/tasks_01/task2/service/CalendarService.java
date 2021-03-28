package by.training.lonelyday.tasks_01.task2.service;

import by.training.lonelyday.tasks_01.task2.enums.MonthEnum;

import java.time.YearMonth;

public class CalendarService {
    private static final int FEBRUARY_DAYS_DEFAULT = 28;
    private static final int FEBRUARY_DAYS_LEAP = 29;


    /**
     * Returns a number of days in specified year:month
     * Year and month must be valid
     *
     * @param year  year number
     * @param month month number
     * @return number of days in specified year:month
     */
    public static int calcDaysNumber(int year, MonthEnum month) throws IllegalStateException {
        if (year <= 0)
            throw new IllegalStateException("Unexpected year value: " + year);

        @SuppressWarnings("UnnecessaryLocalVariable")
        int daysNumber = switch (month) {
            case January, March, May, July, August, October, December -> 31;
            case April, June, September, November -> 30;
            case February -> calcFebruaryDaysNumber(year);
        };

        return daysNumber;

    }

    private static int calcFebruaryDaysNumber(int year) {
        boolean isleap = true;
        if (year % 4 != 0)
            isleap = false;
        else if (year % 100 == 0 && year % 400 != 0)
            isleap = false;

        if (isleap)
            return FEBRUARY_DAYS_LEAP;
        else
            return FEBRUARY_DAYS_DEFAULT;
    }
}
