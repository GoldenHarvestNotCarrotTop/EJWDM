package by.training.lonelyday.tasks_01.task7.ui;


import by.training.lonelyday.tasks_01.task7.entity.PointEntity;
import by.training.lonelyday.until.reporter.BaseReporter;

public class Task7Reporter extends BaseReporter {

    public static void reportNearestPoint(PointEntity a) {
        reportString("Nearest point to the origin is Point(" + a.getName() + ")");
    }
}
