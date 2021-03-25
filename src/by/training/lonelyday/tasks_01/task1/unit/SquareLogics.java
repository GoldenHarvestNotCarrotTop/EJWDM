package by.training.lonelyday.tasks_01.task1.unit;

public class SquareLogics {
    private static int getIntSquare(int n){
        return n*n;
    }

    public static int getIntSquareLastDigit(int n){
        int square = getIntSquare(n);
        return DigitsLogics.getLastIntDigit(square);
    }
}
