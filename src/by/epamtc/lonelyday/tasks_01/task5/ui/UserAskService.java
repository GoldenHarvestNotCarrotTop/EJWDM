package by.epamtc.lonelyday.tasks_01.task5.ui;

import by.epamtc.lonelyday.util.scanner.DataScanner;

public class UserAskService {
    public static int askInt(){
        Task5Reporter.reportString("Enter integer:");
        return DataScanner.enterInt();
    }

}
