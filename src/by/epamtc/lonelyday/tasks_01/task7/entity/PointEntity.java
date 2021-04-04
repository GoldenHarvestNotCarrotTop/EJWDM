package by.epamtc.lonelyday.tasks_01.task7.entity;

import java.io.Serializable;
import java.util.Objects;

public class PointEntity implements Serializable {
    private double x;
    private double y;
    private String name;

    public PointEntity() {
        x = 0;
        y = 0;
        name = "Origin";
    }

    public PointEntity(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }


    @Override
    public String toString() {
        return "PointEntity{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointEntity that = (PointEntity) o;
        return Double.compare(that.getX(), getX()) == 0 && Double.compare(that.getY(), getY()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getName());
    }

}
