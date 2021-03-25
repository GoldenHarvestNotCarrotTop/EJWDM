package by.training.lonelyday.tasks_01.task3.run;

import by.training.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.training.lonelyday.tasks_01.task3.entity.SquareEntity;
import by.training.lonelyday.tasks_01.task3.service.CircleConstructor;
import by.training.lonelyday.tasks_01.task3.service.SquareConstructor;
import by.training.lonelyday.tasks_01.task3.ui.Reporter;
import by.training.lonelyday.tasks_01.task3.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        double squareArea = UserAskService.askSquareArea();

        SquareEntity squareObject = SquareConstructor.getSquareByArea(squareArea);  // TODO сравнение площадей
        CircleEntity inscribedCircleObject =  CircleConstructor.getCircleInscribedInSquare(squareObject);
        SquareEntity inscribedSquareObject = SquareConstructor.getSquareInscribedInCircle(inscribedCircleObject);


        Reporter.reportSquareArea(inscribedSquareObject.getArea());
    }
}
