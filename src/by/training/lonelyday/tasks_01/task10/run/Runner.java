package by.training.lonelyday.tasks_01.task10.run;

import by.training.lonelyday.tasks_01.task10.entity.PointEntity;
import by.training.lonelyday.tasks_01.task10.entity.SegmentEntity;
import by.training.lonelyday.tasks_01.task10.service.FunctionIteratorService;
import by.training.lonelyday.tasks_01.task10.ui.Task10Reporter;
import by.training.lonelyday.tasks_01.task10.ui.UserAskService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SegmentEntity segment = UserAskService.askSegment();

        double step = UserAskService.askStep();

        List<PointEntity> pointEntityList = FunctionIteratorService.iterate(segment,step);

        Task10Reporter.reportResult(pointEntityList);


    }
}
