package by.training.lonelyday.tasks_01.task3.entity;

public class SquareEntity {

    private double side;

    public SquareEntity(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }
}
