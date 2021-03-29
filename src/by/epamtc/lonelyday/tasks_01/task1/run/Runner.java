package by.epamtc.lonelyday.tasks_01.task1.run;

import by.epamtc.lonelyday.tasks_01.task1.service.DigitService;
import by.epamtc.lonelyday.tasks_01.task1.service.SquareService;
import by.epamtc.lonelyday.tasks_01.task1.reporter.Task1Reporter;
import by.epamtc.lonelyday.until.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        Task1Reporter.inputNumberReport();
        int n = DataScanner.enterInt();

        int lastDigit = DigitService.calcLastIntDigit(n);
        int squareLastDigit = SquareService.calcIntSquareLastDigit(lastDigit);

        Task1Reporter.answerReport(squareLastDigit);



    }
}
