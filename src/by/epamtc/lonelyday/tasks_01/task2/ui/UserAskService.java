package by.epamtc.lonelyday.tasks_01.task2.ui;

import by.epamtc.lonelyday.tasks_01.task2.enums.MonthEnum;
import by.epamtc.lonelyday.util.scanner.DataScanner;

public class UserAskService {


    public static int askYear() {
        int year = 0;

        while (year <= 0) {
            Task2Reporter.reportString("Enter a year:");
            year = DataScanner.enterInt();
            if (year <= 0)
                Task2Reporter.reportInputError();
        }

        return year;
    }


    public static MonthEnum askMonthNumber() {
        int monthNumber = 0;

        while (!(1 <= monthNumber && monthNumber <= 12)) {
            Task2Reporter.reportString("Enter month number:");
            monthNumber = DataScanner.enterInt();
            if (!(1 <= monthNumber && monthNumber <= 12))
                Task2Reporter.reportInputError();
        }
        @SuppressWarnings("UnnecessaryLocalVariable")
        MonthEnum month = switch (monthNumber) {
            case 1 -> MonthEnum.January;
            case 2 -> MonthEnum.February;
            case 3 -> MonthEnum.March;
            case 4 -> MonthEnum.April;
            case 5 -> MonthEnum.May;
            case 6 -> MonthEnum.June;
            case 7 -> MonthEnum.July;
            case 8 -> MonthEnum.August;
            case 9 -> MonthEnum.September;
            case 10 -> MonthEnum.October;
            case 11 -> MonthEnum.November;
            case 12 -> MonthEnum.December;
            default -> null;
        };


        return month;
    }

}
