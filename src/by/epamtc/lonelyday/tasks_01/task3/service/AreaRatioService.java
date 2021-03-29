package by.epamtc.lonelyday.tasks_01.task3.service;

import by.epamtc.lonelyday.tasks_01.task3.entity.SquareEntity;

public class AreaRatioService {
    public static double calcSquareAreaRatio(SquareEntity a, SquareEntity b){
        return a.calcArea()/b.calcArea();
    }
}
