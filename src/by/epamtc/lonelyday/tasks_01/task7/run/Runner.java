package by.epamtc.lonelyday.tasks_01.task7.run;

import by.epamtc.lonelyday.tasks_01.task7.entity.PointEntity;
import by.epamtc.lonelyday.tasks_01.task7.service.DistanceService;
import by.epamtc.lonelyday.tasks_01.task7.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task7.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        PointEntity a = UserAskService.askPoint("A");
        PointEntity b = UserAskService.askPoint("B");

        PointEntity nearestToOrigin =  DistanceService.calcNearestPointToOrigin(a,b);
        Reporter.reportNearestPoint(nearestToOrigin);

    }
}
