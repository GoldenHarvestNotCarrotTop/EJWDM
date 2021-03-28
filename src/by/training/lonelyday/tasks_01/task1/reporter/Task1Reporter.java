package by.training.lonelyday.tasks_01.task1.reporter;

import by.training.lonelyday.until.reporter.BaseReporter;

public class Task1Reporter extends BaseReporter {
    public static void inputNumberReport(){
        reportString("Enter a number");
    }
    public static void answerReport(int squareLastDigit){
        reportString("Last square digit:");
        reportString(String.valueOf(squareLastDigit));
    }
}
