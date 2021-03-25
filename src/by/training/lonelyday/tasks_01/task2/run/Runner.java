package by.training.lonelyday.tasks_01.task2.run;

import by.training.lonelyday.tasks_01.task2.service.CalendarService;
import by.training.lonelyday.tasks_01.task2.ui.Reporter;
import by.training.lonelyday.tasks_01.task2.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int year = UserAskService.askYear();
        int month = UserAskService.askMonthNumber();

        int daysNumber = CalendarService.getDaysNumber(year, month);

        Reporter.reportDaysNumber(daysNumber);
    }
}
