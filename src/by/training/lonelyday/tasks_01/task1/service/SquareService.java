package by.training.lonelyday.tasks_01.task1.service;

public class SquareService {
    public static int calcIntSquare(int n){
        return n*n;
    }

    public static int calcIntSquareLastDigit(int n){
        int square = calcIntSquare(n);
        return DigitService.calcLastIntDigit(square);
    }
}
