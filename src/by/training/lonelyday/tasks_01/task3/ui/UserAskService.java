package by.training.lonelyday.tasks_01.task3.ui;

import by.training.lonelyday.scanner.DataScanner;

public class UserAskService {
    public static double askSquareArea() {
        double area = -1;

        while (area < 0) {
            Reporter.reportString("Enter square area:");
            area = DataScanner.enterDoubleFromConsole();
        }

        return area;
    }
}
