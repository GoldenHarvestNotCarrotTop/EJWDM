package by.training.lonelyday.tasks_01.task6.run;

import by.training.lonelyday.tasks_01.task6.service.TimeService;
import by.training.lonelyday.tasks_01.task6.ui.Task6Reporter;
import by.training.lonelyday.tasks_01.task6.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int seconds = UserAskService.askSeconds(TimeService.SECONDS_IN_DAY);

        int minutes = TimeService.getMinutesBySeconds(seconds);
        int hours = TimeService.getHoursBySeconds(seconds);

        Task6Reporter.reportHours(hours);
        Task6Reporter.reportMinutes(minutes);
        Task6Reporter.reportSeconds(seconds);

    }
}
