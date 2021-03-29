package by.epamtc.lonelyday.tasks_01.task10.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;
import by.epamtc.lonelyday.tasks_01.task10.entity.PointEntity;

import java.util.List;

public class Reporter extends BaseReporter {
    private static final int PADLEFT_SIZE = 10;
    private static final int PADRIGHT_SIZE = 10;

    public static void reportResultList(List<PointEntity> pointEntityList) {
        for (PointEntity point : pointEntityList) {
            reportString(padRight(String.valueOf(point.getX()), PADRIGHT_SIZE)
                    + "|"
                    + padLeft(String.valueOf(point.getY()), PADLEFT_SIZE));
        }
    }


}
