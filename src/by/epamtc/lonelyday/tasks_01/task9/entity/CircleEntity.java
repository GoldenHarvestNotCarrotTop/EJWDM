package by.epamtc.lonelyday.tasks_01.task9.entity;

public class CircleEntity {

    private double r;

    public CircleEntity(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double calcArea(){
        return Math.PI*getR()*getR();
    }

    public double calcLength(){
        return 2*Math.PI*getR();
    }

}
