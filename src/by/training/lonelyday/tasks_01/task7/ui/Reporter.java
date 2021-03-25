package by.training.lonelyday.tasks_01.task7.ui;

import by.training.lonelyday.tasks_01.task7.entity.PointEntity;

public class Reporter {

    public static void reportString(String s) {
        System.out.println(s);
    }

    public static void reportNearestPoint(PointEntity a) {
        Reporter.reportString("Nearest point to the origin is Point(" + a.getName() + ")");
    }
}
