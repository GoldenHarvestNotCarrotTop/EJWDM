package by.epamtc.lonelyday.tasks_01.task8.service;

public class FunctionService {
    public static double calculate(double x){
        if (x < 3){
            return less3(x);
        } else {
            return greaterOrEqual3(x);
        }
    }

    private static double less3(double x){
        return 1/(Math.pow(x,3) - 6);
    }

    private static double greaterOrEqual3(double x){
        return -(x*x)+3*x+9;
    }


}
