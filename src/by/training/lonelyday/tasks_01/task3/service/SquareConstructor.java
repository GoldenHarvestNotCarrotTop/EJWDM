package by.training.lonelyday.tasks_01.task3.service;

import by.training.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.training.lonelyday.tasks_01.task3.entity.SquareEntity;

import static java.lang.Math.max;

public class SquareConstructor {
    public static SquareEntity createSquareByArea(double area) {
        area = max(area, 0.0);
        double side = Math.sqrt(area);
        return new SquareEntity(side);
    }

    public static SquareEntity createSquareInscribedInCircle(CircleEntity circle) {
        double radius = circle.getRadius();
        double side = radius * Math.sqrt(2);
        return new SquareEntity(side);
    }
}
