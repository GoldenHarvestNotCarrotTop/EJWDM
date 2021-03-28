package by.training.lonelyday.tasks_01.task4.run;


import by.training.lonelyday.tasks_01.task4.service.ListService;
import by.training.lonelyday.tasks_01.task4.ui.Task4Reporter;
import by.training.lonelyday.tasks_01.task4.ui.UserAskService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> data = UserAskService.askData(4);
        int evenCount = ListService.countEven(data);

        if (evenCount >= 2) {
            Task4Reporter.reportTrue();
        } else {
            Task4Reporter.reportFalse();
        }
    }
}
