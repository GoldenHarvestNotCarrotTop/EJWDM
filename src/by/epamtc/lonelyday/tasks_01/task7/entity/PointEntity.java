package by.epamtc.lonelyday.tasks_01.task7.entity;

public class PointEntity {

    private double x;
    private double y;
    private String name;

    public String getName() {
        return name;
    }

    public PointEntity(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }



}
