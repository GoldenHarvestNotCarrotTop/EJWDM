package by.epamtc.lonelyday.tasks_01.task9.ui;

import by.epamtc.lonelyday.until.scanner.DataScanner;

public class UserAskService {


    public static double askRadius() {
        Task9Reporter.reportString("Enter radius:");
        return DataScanner.enterDouble();
    }
}
