package by.training.lonelyday.tasks_01.task9.entity;

public class CircleEntity {

    private double r;

    public CircleEntity(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea(){
        return Math.PI*getR()*getR();
    }

    public double getLength(){
        return 2*Math.PI*getR();
    }

}
