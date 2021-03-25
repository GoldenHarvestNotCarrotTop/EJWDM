package by.training.lonelyday.tasks_01.task3.service;

import by.training.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.training.lonelyday.tasks_01.task3.entity.SquareEntity;

public class SquareConstructor {
    public static SquareEntity getSquareByArea(double area){
        double side = Math.sqrt(area);
        return new SquareEntity(side);
    }

    public static SquareEntity getSquareInscribedInCircle(CircleEntity circle){
        double radius = circle.getRaduis();
        double side = radius * Math.sqrt(2);
        return new SquareEntity(side);
    }
}
