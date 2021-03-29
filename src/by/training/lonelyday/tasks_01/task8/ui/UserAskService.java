package by.training.lonelyday.tasks_01.task8.ui;

import by.training.lonelyday.until.scanner.DataScanner;

public class UserAskService {


    public static double askX() {
        Task8Reporter.reportString("Enter x:");
        return DataScanner.enterDouble();
    }
}
