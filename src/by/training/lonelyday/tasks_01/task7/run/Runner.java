package by.training.lonelyday.tasks_01.task7.run;

import by.training.lonelyday.tasks_01.task7.entity.PointEntity;
import by.training.lonelyday.tasks_01.task7.service.DistanceService;
import by.training.lonelyday.tasks_01.task7.ui.Task7Reporter;
import by.training.lonelyday.tasks_01.task7.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        PointEntity a = UserAskService.askPoint("A");
        PointEntity b = UserAskService.askPoint("B");

        PointEntity nearestToOrigin =  DistanceService.calcNearestPointToOrigin(a,b);
        Task7Reporter.reportNearestPoint(nearestToOrigin);

    }
}
