package by.epamtc.lonelyday.tasks_01.task3.entity;


import java.io.Serializable;
import java.util.Objects;

public class CircleEntity implements Serializable {
    private double radius;

    public CircleEntity() {
        radius = 0;
    }

    public CircleEntity(double radius) {
        this.radius = Math.max(radius, 0);
    }


    public double calcArea() {
        return Math.PI * getRadius() * getRadius();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }


    @Override
    public String toString() {
        return "CircleEntity{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleEntity that = (CircleEntity) o;
        return Double.compare(that.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }
}
