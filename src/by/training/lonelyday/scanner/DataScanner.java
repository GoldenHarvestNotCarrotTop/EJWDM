package by.training.lonelyday.scanner;

import by.training.lonelyday.reporter.Reporter;

import java.util.Scanner;

public class DataScanner {

    public static double enterDoubleFromConsole() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            Reporter.reportInputError();
            sc.next();
        }
        return sc.nextDouble();

    }

    public static int enterIntFromConsole() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            Reporter.reportInputError();
            sc.next();
        }
        return sc.nextInt();
    }
}






