package by.epamtc.lonelyday.util.reporter;

public class BaseReporter {
    public static void reportInputError() {
        System.out.println("[Error] Wrong input. Try again!");
    }

    public static void reportString(String s) {
        System.out.println(s);
    }



    protected static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    protected static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

}
