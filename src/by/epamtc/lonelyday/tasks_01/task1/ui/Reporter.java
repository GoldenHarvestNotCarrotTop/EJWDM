package by.epamtc.lonelyday.tasks_01.task1.ui;

import by.epamtc.lonelyday.tasks_01.util.reporter.BaseReporter;

public class Reporter extends BaseReporter {
    public static void answerReport(int squareLastDigit){
        reportString("Last square digit:");
        reportString(String.valueOf(squareLastDigit));
    }
}
