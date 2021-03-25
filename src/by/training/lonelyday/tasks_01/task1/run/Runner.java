package by.training.lonelyday.tasks_01.task1.run;

import by.training.lonelyday.scanner.DataScanner;
import by.training.lonelyday.tasks_01.task1.reporter.Reporter;
import by.training.lonelyday.tasks_01.task1.unit.DigitsLogics;
import by.training.lonelyday.tasks_01.task1.unit.SquareLogics;

public class Runner {
    public static void main(String[] args) {
        Reporter.greetingsReport();
        int n = DataScanner.enterIntFromConsole();

        int lastDigit = DigitsLogics.getLastIntDigit(n);
        int squareLastDigit = SquareLogics.getIntSquareLastDigit(lastDigit);

        Reporter.answerReport(squareLastDigit);



    }
}
