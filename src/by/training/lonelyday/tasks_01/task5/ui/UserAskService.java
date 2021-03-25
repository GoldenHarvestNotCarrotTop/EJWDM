package by.training.lonelyday.tasks_01.task5.ui;

import by.training.lonelyday.scanner.DataScanner;

public class UserAskService {
    public static int askInt(){
        Reporter.reportString("Enter integer:");
        return DataScanner.enterIntFromConsole();
    }

}
