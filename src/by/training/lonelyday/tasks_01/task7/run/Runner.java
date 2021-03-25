package by.training.lonelyday.tasks_01.task7.run;

import by.training.lonelyday.tasks_01.task7.entity.PointEntity;
import by.training.lonelyday.tasks_01.task7.service.DistanceService;
import by.training.lonelyday.tasks_01.task7.ui.Reporter;
import by.training.lonelyday.tasks_01.task7.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        PointEntity a = UserAskService.askPoint("A");
        PointEntity b = UserAskService.askPoint("B");

        PointEntity origin = new PointEntity(0,0, "origin");

        double distA = DistanceService.calcDistanceBetween2Points(origin, a);
        double distB = DistanceService.calcDistanceBetween2Points(origin, b);

        if(distA < distB)
            Reporter.reportNearestPoint(a);
        else
            Reporter.reportNearestPoint(b);

    }
}
