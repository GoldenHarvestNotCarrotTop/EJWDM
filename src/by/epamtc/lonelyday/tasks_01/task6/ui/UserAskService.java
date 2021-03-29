package by.epamtc.lonelyday.tasks_01.task6.ui;

import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;

public class UserAskService {
    public static int askSeconds(int maxSeconds) {
        int seconds = -1;
        while (seconds > maxSeconds || seconds < 0) {
            Reporter.reportString("Enter seconds number:");
            seconds = DataScanner.enterInt();
            if (seconds > maxSeconds || seconds < 0)
                Reporter.reportInputError();
        }
        return seconds;
    }

}
