package by.epamtc.lonelyday.tasks_01.task10.run;

import by.epamtc.lonelyday.tasks_01.task10.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task10.entity.PointEntity;
import by.epamtc.lonelyday.tasks_01.task10.entity.SegmentEntity;
import by.epamtc.lonelyday.tasks_01.task10.service.FunctionIteratorService;
import by.epamtc.lonelyday.tasks_01.task10.ui.UserAskService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SegmentEntity segment = UserAskService.askSegment();

        double step = UserAskService.askStep();

        List<PointEntity> pointEntityList = FunctionIteratorService.iterate(segment,step);

        Reporter.reportResultList(pointEntityList);


    }
}
