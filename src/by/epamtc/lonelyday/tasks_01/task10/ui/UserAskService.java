package by.epamtc.lonelyday.tasks_01.task10.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;
import by.epamtc.lonelyday.tasks_01.util.scanner.DataScanner;
import by.epamtc.lonelyday.tasks_01.task10.entity.SegmentEntity;


public class UserAskService {


    public static SegmentEntity askSegment() {
        BaseReporter.reportString("Enter left border:");
        double l = DataScanner.enterDouble();
        double r = l - 1;

        while (r < l) {
            BaseReporter.reportString("Enter right border");
            r = DataScanner.enterDouble();
            if (r < l)
                Reporter.reportInputError();
        }

        return new SegmentEntity(l, r);
    }

    public static double askStep() {
        BaseReporter.reportString("Enter step size:");
        return DataScanner.enterDouble();
    }
}
