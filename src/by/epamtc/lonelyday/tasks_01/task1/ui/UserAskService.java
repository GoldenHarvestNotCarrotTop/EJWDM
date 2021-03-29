package by.epamtc.lonelyday.tasks_01.task1.ui;

import by.epamtc.lonelyday.tasks_01.task1.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;

public class UserAskService {
    public static int askInt(){
        Reporter.reportString("Enter integer :");
        return DataScanner.enterInt();
    }
}
