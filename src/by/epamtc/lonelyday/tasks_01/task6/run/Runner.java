package by.epamtc.lonelyday.tasks_01.task6.run;

import by.epamtc.lonelyday.tasks_01.task6.service.TimeService;
import by.epamtc.lonelyday.tasks_01.task6.ui.UserAskService;
import by.epamtc.lonelyday.tasks_01.task6.ui.Task6Reporter;

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
