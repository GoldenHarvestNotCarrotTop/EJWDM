package by.training.lonelyday.tasks_01.task10.ui;

import by.training.lonelyday.until.scanner.DataScanner;
import by.training.lonelyday.tasks_01.task10.entity.SegmentEntity;



public class UserAskService {


    public static SegmentEntity askSegment() {
        Reporter.reportString("Enter left border:");
        double l = DataScanner.enterDouble();
        Reporter.reportString("Enter right border");
        double r = DataScanner.enterDouble();
        return new SegmentEntity(l, r);
    }

    public static double askStep(){
        Reporter.reportString("Enter step size:");
        return DataScanner.enterDouble();
    }
}
