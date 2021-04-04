package by.epamtc.lonelyday.tasks_01.task8.run;

import by.epamtc.lonelyday.tasks_01.task8.service.FunctionService;
import by.epamtc.lonelyday.tasks_01.task8.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task8.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        double x = UserAskService.askX();

        double result = FunctionService.calculate(x);

        Reporter.reportResult(result);

    }
}
