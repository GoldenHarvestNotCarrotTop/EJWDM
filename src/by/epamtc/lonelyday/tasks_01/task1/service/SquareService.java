package by.epamtc.lonelyday.tasks_01.task1.service;

public class SquareService {
    public static long calcIntSquare(int n){
        return n*(long)n;
    }

    public static int calcIntSquareLastDigit(int n){
        long square = calcIntSquare(n);
        return DigitService.calcLastIntDigit(square);
    }
}
