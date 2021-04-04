package by.epamtc.lonelyday.tasks_01.task10.entity;

import java.io.Serializable;
import java.util.Objects;

public class PointEntity implements Serializable {

    public double x;
    public double y;


    public PointEntity() {
        x = 0;
        y = 0;
    }

    public PointEntity(double x, double y) {
        this.x = x;
        this.y = y;
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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointEntity that = (PointEntity) o;
        return Double.compare(that.getX(), getX()) == 0 && Double.compare(that.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
