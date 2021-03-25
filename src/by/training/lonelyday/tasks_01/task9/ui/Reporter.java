package by.training.lonelyday.tasks_01.task9.ui;

public class Reporter {

    public static void reportString(String s) {
        System.out.println(s);
    }


    public static void reportLength(double length) {
        Reporter.reportString("Circumference length:");
        System.out.println(length);
    }

    public static void reportArea(double area) {
        Reporter.reportString("Circumference area:");
        System.out.println(area);
    }
}
