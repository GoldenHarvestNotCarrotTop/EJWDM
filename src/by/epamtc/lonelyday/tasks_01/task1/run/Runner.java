package by.epamtc.lonelyday.tasks_01.task1.run;

import by.epamtc.lonelyday.tasks_01.task1.service.DigitService;
import by.epamtc.lonelyday.tasks_01.task1.service.SquareService;
import by.epamtc.lonelyday.tasks_01.task1.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task1.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int n = UserAskService.askInt();

        int lastDigit = DigitService.calcLastIntDigit(n);
        int squareLastDigit = SquareService.calcIntSquareLastDigit(lastDigit);

        Reporter.answerReport(squareLastDigit);
    }
}
