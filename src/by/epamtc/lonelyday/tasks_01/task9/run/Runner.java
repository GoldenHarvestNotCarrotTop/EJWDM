package by.epamtc.lonelyday.tasks_01.task9.run;

import by.epamtc.lonelyday.tasks_01.task9.entity.CircleEntity;
import by.epamtc.lonelyday.tasks_01.task9.ui.Task9Reporter;
import by.epamtc.lonelyday.tasks_01.task9.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        double r = UserAskService.askRadius();

        CircleEntity circle = new CircleEntity(r);

        Task9Reporter.reportLength(circle.calcLength());
        Task9Reporter.reportArea(circle.calcArea());
    }
}
