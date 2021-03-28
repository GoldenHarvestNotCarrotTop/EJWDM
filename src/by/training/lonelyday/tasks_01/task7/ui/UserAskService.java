package by.training.lonelyday.tasks_01.task7.ui;

import by.training.lonelyday.until.scanner.DataScanner;
import by.training.lonelyday.tasks_01.task7.entity.PointEntity;

public class UserAskService {


    public static PointEntity askPoint(String pointName) {
        Reporter.reportString("Enter Point(" + pointName + ") x:");
        double x = DataScanner.enterDouble();
        Reporter.reportString("Enter Point(" + pointName + ") y:");
        double y = DataScanner.enterDouble();
        return new PointEntity(x, y, pointName);

    }

}
