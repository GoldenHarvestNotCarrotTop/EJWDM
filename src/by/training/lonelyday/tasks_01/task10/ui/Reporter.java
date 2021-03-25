package by.training.lonelyday.tasks_01.task10.ui;

import by.training.lonelyday.tasks_01.task10.entity.PointEntity;

import java.util.List;

public class Reporter {

    private static int PADLEFT_SIZE = 10;
    private static int PADRIGHT_SIZE = 10;

    public static void reportString(String s) {
        System.out.println(s);
    }

    public static void reportResult(List<PointEntity> pointEntityList){
        for(PointEntity point: pointEntityList){
            Reporter.reportString( padRight(String.valueOf(point.getX()), PADRIGHT_SIZE)
                    + "|"
                    + padLeft(String.valueOf(point.getY()), PADLEFT_SIZE) );
        }
    }


    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    private static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

}
