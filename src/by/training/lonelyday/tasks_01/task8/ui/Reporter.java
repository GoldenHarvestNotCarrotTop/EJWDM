package by.training.lonelyday.tasks_01.task8.ui;

public class Reporter {

    public static void reportString(String s) {
        System.out.println(s);
    }


    public static void reportResult(double result) {
        Reporter.reportString("F(x) is:");
        System.out.println(result);
    }

}
