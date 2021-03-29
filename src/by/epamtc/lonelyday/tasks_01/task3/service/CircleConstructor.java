package by.epamtc.lonelyday.tasks_01.task3.service;

import by.epamtc.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.epamtc.lonelyday.tasks_01.task3.entity.SquareEntity;

public class CircleConstructor {
    public static CircleEntity createCircleInscribedInSquare(SquareEntity square) {
        double radius = square.getSide() / 2;
        return new CircleEntity(radius);
    }



}
