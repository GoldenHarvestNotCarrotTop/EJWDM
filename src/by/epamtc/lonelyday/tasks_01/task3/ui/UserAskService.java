package by.epamtc.lonelyday.tasks_01.task3.ui;

import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;

public class UserAskService {
    public static double askSquareArea() {
        double area = -1;

        while (area < 0) {
            Reporter.reportString("Enter square area:");
            area = DataScanner.enterDouble();
            if (area < 0)
                Reporter.reportInputError();
        }

        return area;
    }
}
