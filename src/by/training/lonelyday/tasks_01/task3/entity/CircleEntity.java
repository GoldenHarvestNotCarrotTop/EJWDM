package by.training.lonelyday.tasks_01.task3.entity;

public class CircleEntity {
    private double raduis;

    public CircleEntity(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public double getArea() {
        return Math.PI * getRaduis() * getRaduis();
    }
}
