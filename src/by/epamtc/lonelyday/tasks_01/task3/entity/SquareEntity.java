package by.epamtc.lonelyday.tasks_01.task3.entity;

public class SquareEntity {

    private double side;

    public SquareEntity(double side) {
        this.side = Math.max(side, 0);
    }

    public void setSide(double side) {
        this.side = Math.max(side, 0);
    }

    public double getSide() {
        return side;
    }

    public double calcArea() {
        return side * side;
    }
}
