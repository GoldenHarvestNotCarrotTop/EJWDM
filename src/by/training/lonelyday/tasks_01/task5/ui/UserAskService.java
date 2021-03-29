package by.training.lonelyday.tasks_01.task5.ui;

import by.training.lonelyday.until.scanner.DataScanner;

public class UserAskService {
    public static int askInt(){
        Task5Reporter.reportString("Enter integer:");
        return DataScanner.enterInt();
    }

}
