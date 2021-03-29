package by.epamtc.lonelyday.tasks_01.task4.run;


import by.epamtc.lonelyday.tasks_01.task4.service.ListService;
import by.epamtc.lonelyday.tasks_01.task4.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task4.ui.UserAskService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> data = UserAskService.askData(4);
        int evenCount = ListService.countEven(data);

        if (evenCount >= 2) {
            Reporter.reportTrue();
        } else {
            Reporter.reportFalse();
        }
    }
}
