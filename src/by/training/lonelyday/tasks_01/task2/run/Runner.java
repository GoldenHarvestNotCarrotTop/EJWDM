package by.training.lonelyday.tasks_01.task2.run;

import by.training.lonelyday.tasks_01.task2.enums.MonthEnum;
import by.training.lonelyday.tasks_01.task2.service.CalendarService;
import by.training.lonelyday.tasks_01.task2.ui.Task2Reporter;
import by.training.lonelyday.tasks_01.task2.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int year = UserAskService.askYear();
        MonthEnum month = UserAskService.askMonthNumber();

        int daysNumber = CalendarService.calcDaysNumber(year, month);

        Task2Reporter.reportDaysNumber(daysNumber);
    }
}
