package by.training.lonelyday.tasks_01.task7.ui;

import by.training.lonelyday.tasks_01.task10.ui.Reporter;
import by.training.lonelyday.tasks_01.task7.entity.PointEntity;

public class Task7Reporter extends Reporter {

    public static void reportNearestPoint(PointEntity a) {
        reportString("Nearest point to the origin is Point(" + a.getName() + ")");
    }
}
