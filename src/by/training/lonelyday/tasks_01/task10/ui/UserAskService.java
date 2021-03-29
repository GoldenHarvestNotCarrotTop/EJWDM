package by.training.lonelyday.tasks_01.task10.ui;

import by.training.lonelyday.tasks_01.task10.entity.SegmentEntity;
import by.training.lonelyday.until.scanner.DataScanner;

import static by.training.lonelyday.until.reporter.BaseReporter.reportString;


public class UserAskService {


    public static SegmentEntity askSegment() {
        reportString("Enter left border:");
        double l = DataScanner.enterDouble();
        double r = l - 1;

        while (r < l) {
            reportString("Enter right border");
            r = DataScanner.enterDouble();
            if (r < l)
                Task10Reporter.reportInputError();
        }

        return new SegmentEntity(l, r);
    }

    public static double askStep() {
        reportString("Enter step size:");
        return DataScanner.enterDouble();
    }
}
