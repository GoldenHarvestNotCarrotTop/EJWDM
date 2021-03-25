package by.training.lonelyday.tasks_01.task7.service;

import by.training.lonelyday.tasks_01.task7.entity.PointEntity;

public class DistanceService {
    public static double calcDistanceBetween2Points(PointEntity a, PointEntity b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
    }
}
