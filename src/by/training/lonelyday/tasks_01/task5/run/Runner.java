package by.training.lonelyday.tasks_01.task5.run;

import by.training.lonelyday.tasks_01.task5.service.IntService;
import by.training.lonelyday.tasks_01.task5.ui.Reporter;
import by.training.lonelyday.tasks_01.task5.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int n = UserAskService.askInt();

        if(IntService.isPerfect(n)){
            Reporter.reportTrue();
        } else {
            Reporter.reportFalse();
        }




    }
}
