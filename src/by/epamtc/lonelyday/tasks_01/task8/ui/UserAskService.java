package by.epamtc.lonelyday.tasks_01.task8.ui;

import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;

public class UserAskService {


    public static double askX() {
        Task8Reporter.reportString("Enter x:");
        return DataScanner.enterDouble();
    }
}
