package by.epamtc.lonelyday.tasks_01.task7.ui;


import by.epamtc.lonelyday.tasks_01.task7.entity.PointEntity;
import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Task7Reporter extends BaseReporter {

    public static void reportNearestPoint(PointEntity a) {
        reportString("Nearest point to the origin is Point(" + a.getName() + ")");
    }
}
