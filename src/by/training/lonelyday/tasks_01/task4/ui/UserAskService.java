package by.training.lonelyday.tasks_01.task4.ui;

import by.training.lonelyday.until.scanner.DataScanner;

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
        Reporter.reportString("Enter integer number " + intNumber + ":");
        return DataScanner.enterInt();
    }

}
