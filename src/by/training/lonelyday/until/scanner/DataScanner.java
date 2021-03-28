package by.training.lonelyday.until.scanner;

import by.training.lonelyday.until.reporter.BaseReporter;

import java.util.Scanner;

public class DataScanner {

    public static double enterDouble() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            BaseReporter.reportInputError();
            sc.next();
        }
        return sc.nextDouble();

    }

    public static int enterInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            BaseReporter.reportInputError();
            sc.next();
        }
        return sc.nextInt();
    }
}






