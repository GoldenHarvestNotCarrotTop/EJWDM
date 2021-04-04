package by.epamtc.lonelyday.tasks_01.task9.entity;

import java.io.Serializable;
import java.util.Objects;

public class CircleEntity implements Serializable {
    private double r;


    public CircleEntity() {
        r = 0;
    }

    public CircleEntity(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }


    public double calcArea() {
        return Math.PI * getR() * getR();
    }

    public double calcLength() {
        return 2 * Math.PI * getR();
    }


    @Override
    public String toString() {
        return "CircleEntity{" +
                "r=" + r +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleEntity that = (CircleEntity) o;
        return Double.compare(that.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getR());
    }

}
