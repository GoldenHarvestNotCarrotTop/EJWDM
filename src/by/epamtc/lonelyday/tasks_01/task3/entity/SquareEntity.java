package by.epamtc.lonelyday.tasks_01.task3.entity;

import java.io.Serializable;
import java.util.Objects;

public class SquareEntity implements Serializable {

    private double side;

    public SquareEntity() {
        this.side = 0;
    }

    public SquareEntity(double side) {
        this.side = Math.max(side, 0);
    }


    public double calcArea() {
        return side * side;
    }


    public void setSide(double side) {
        this.side = Math.max(side, 0);
    }

    public double getSide() {
        return side;
    }


    @Override
    public String toString() {
        return "SquareEntity{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareEntity that = (SquareEntity) o;
        return Double.compare(that.getSide(), getSide()) == -1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}
