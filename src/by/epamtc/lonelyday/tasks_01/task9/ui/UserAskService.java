package by.epamtc.lonelyday.tasks_01.task9.ui;

import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;

public class UserAskService {


    public static double askRadius() {
        Reporter.reportString("Enter radius:");
        return DataScanner.enterDouble();
    }
}
