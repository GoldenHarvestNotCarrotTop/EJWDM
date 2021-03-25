package by.training.lonelyday.tasks_01.task2.service;

import java.time.YearMonth;

public class CalendarService {


    /**
     * Returns a number of days in specified year:month
     * Year and month must be valid
     *
     * @param year  valid year
     * @param month valid month
     * @return number of days in specified year:month
     */
    public static int getDaysNumber(int year, int month) {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        return yearMonthObject.lengthOfMonth();
    }
}
