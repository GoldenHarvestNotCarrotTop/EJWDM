package by.training.lonelyday.tasks_01.task5.run;

import by.training.lonelyday.tasks_01.task5.service.IntService;
import by.training.lonelyday.tasks_01.task5.ui.Task5Reporter;
import by.training.lonelyday.tasks_01.task5.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int n = UserAskService.askInt();

        boolean perfectness = IntService.isPerfect(n);

        Task5Reporter.reportBool(perfectness);

    }
}
