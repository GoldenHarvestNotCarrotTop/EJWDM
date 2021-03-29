package by.epamtc.lonelyday.tasks_01.task4.ui;

import by.epamtc.lonelyday.until.scanner.DataScanner;

import java.util.ArrayList;
import java.util.List;

public class UserAskService {
    public static List<Integer> askData(int len) {
        List<Integer> data = new ArrayList<>();

        for (int intNumber = 1; intNumber <= len; intNumber++) {
            data.add(askInt(intNumber));
        }
        return data;
    }

    private static int askInt(int intNumber){
        Task4Reporter.reportString("Enter integer number " + intNumber + ":");
        return DataScanner.enterInt();
    }

}
