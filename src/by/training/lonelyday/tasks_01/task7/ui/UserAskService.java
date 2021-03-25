package by.training.lonelyday.tasks_01.task7.ui;

import by.training.lonelyday.scanner.DataScanner;
import by.training.lonelyday.tasks_01.task7.entity.PointEntity;

public class UserAskService {


    public static PointEntity askPoint(String pointName) {
        Reporter.reportString("Enter Point(" + pointName + ") x:");
        double x = DataScanner.enterDoubleFromConsole();
        Reporter.reportString("Enter Point(" + pointName + ") y:");
        double y = DataScanner.enterDoubleFromConsole();
        return new PointEntity(x, y, pointName);

    }

}
