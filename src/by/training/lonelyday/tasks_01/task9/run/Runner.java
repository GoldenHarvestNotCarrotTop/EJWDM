package by.training.lonelyday.tasks_01.task9.run;

import by.training.lonelyday.tasks_01.task9.entity.CircleEntity;
import by.training.lonelyday.tasks_01.task9.ui.Reporter;
import by.training.lonelyday.tasks_01.task9.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        double r = UserAskService.askRadius();

        CircleEntity circle = new CircleEntity(r);

        Reporter.reportLength(circle.getLength());
        Reporter.reportArea(circle.getArea());
    }
}
