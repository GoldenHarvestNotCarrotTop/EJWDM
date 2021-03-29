package by.training.lonelyday.tasks_01.task10.ui;

import by.training.lonelyday.tasks_01.task10.entity.PointEntity;
import by.training.lonelyday.until.reporter.BaseReporter;

import java.util.List;

public class Task10Reporter extends BaseReporter {
    private static final int PADLEFT_SIZE = 10;
    private static final int PADRIGHT_SIZE = 10;

    public static void reportResult(List<PointEntity> pointEntityList) {
        for (PointEntity point : pointEntityList) {
            Task10Reporter.reportString(padRight(String.valueOf(point.getX()), PADRIGHT_SIZE)
                    + "|"
                    + padLeft(String.valueOf(point.getY()), PADLEFT_SIZE));
        }
    }


}
