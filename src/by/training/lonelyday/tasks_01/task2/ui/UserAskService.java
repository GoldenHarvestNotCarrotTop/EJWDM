package by.training.lonelyday.tasks_01.task2.ui;

import by.training.lonelyday.until.scanner.DataScanner;

public class UserAskService {


    public static int askYear() {
        int year = 0;

        while (year <= 0) {
            Reporter.reportString("Enter a year:");
            year = DataScanner.enterInt();
        }

        return year;
    }


    public static int askMonthNumber() {
        int month = 0;

        while(!(1 <= month && month <= 12)){
            Reporter.reportString("Enter month number:");
            month = DataScanner.enterInt();
        }

        return month;
    }

}
