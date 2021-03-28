package by.training.lonelyday.tasks_01.task3.entity;


public class CircleEntity {
    private double radius;

    public CircleEntity(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double calcArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
