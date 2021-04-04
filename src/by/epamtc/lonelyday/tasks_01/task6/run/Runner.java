package by.epamtc.lonelyday.tasks_01.task6.run;

import by.epamtc.lonelyday.tasks_01.task6.service.TimeService;
import by.epamtc.lonelyday.tasks_01.task6.ui.Reporter;
import by.epamtc.lonelyday.tasks_01.task6.ui.UserAskService;

public class Runner {
    public static void main(String[] args) {
        int seconds = UserAskService.askSeconds(TimeService.SECONDS_IN_DAY);

        int minutes = TimeService.getMinutesBySeconds(seconds);
        int hours = TimeService.getHoursBySeconds(seconds);

        Reporter.reportHours(hours);
        Reporter.reportMinutes(minutes);
        Reporter.reportSeconds(seconds);

    }
}
