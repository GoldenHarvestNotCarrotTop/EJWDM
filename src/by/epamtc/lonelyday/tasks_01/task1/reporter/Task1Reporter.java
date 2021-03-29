package by.epamtc.lonelyday.tasks_01.task1.reporter;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Task1Reporter extends BaseReporter {
    public static void inputNumberReport(){
        reportString("Enter a number");
    }
    public static void answerReport(int squareLastDigit){
        reportString("Last square digit:");
        reportString(String.valueOf(squareLastDigit));
    }
}
