package by.training.lonelyday.tasks_01.task9.ui;

import by.training.lonelyday.scanner.DataScanner;

public class UserAskService {


    public static double askRadius() {
        Reporter.reportString("Enter radius:");
        return DataScanner.enterDoubleFromConsole();
    }
}
