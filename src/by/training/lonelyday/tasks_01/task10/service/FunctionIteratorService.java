package by.training.lonelyday.tasks_01.task10.service;

import by.training.lonelyday.tasks_01.task10.entity.PointEntity;
import by.training.lonelyday.tasks_01.task10.entity.SegmentEntity;

import java.util.ArrayList;
import java.util.List;

public class FunctionIteratorService {
    public static List<PointEntity> iterate(SegmentEntity segment, double step){
        List<PointEntity> resultList = new ArrayList<>();
        for(double x = segment.getL(); x <= segment.getR(); x += step){
            double functionResult = FunctionService.calculate(x);
            resultList.add(new PointEntity(x,functionResult));
        }
        return resultList;
    }

}
