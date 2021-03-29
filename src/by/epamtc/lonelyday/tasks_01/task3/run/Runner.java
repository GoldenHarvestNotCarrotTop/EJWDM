package by.epamtc.lonelyday.tasks_01.task3.run;

import by.epamtc.lonelyday.tasks_01.task3.service.CircleConstructor;
import by.epamtc.lonelyday.tasks_01.task3.service.SquareConstructor;
import by.epamtc.lonelyday.tasks_01.task3.ui.Task3Reporter;
import by.epamtc.lonelyday.tasks_01.task3.ui.UserAskService;
import by.epamtc.lonelyday.tasks_01.task3.entity.CircleEntity;
import by.epamtc.lonelyday.tasks_01.task3.entity.SquareEntity;

public class Runner {
    public static void main(String[] args) {
        double squareArea = UserAskService.askSquareArea();

        SquareEntity squareObject = SquareConstructor.createSquareByArea(squareArea);  // TODO сравнение площадей
        CircleEntity inscribedCircleObject =  CircleConstructor.createCircleInscribedInSquare(squareObject);
        SquareEntity inscribedSquareObject = SquareConstructor.createSquareInscribedInCircle(inscribedCircleObject);


        Task3Reporter.reportSquareArea(inscribedSquareObject.calcArea());
    }
}
