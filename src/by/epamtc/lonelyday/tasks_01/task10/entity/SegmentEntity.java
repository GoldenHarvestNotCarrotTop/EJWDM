package by.epamtc.lonelyday.tasks_01.task10.entity;

import java.io.Serializable;
import java.util.Objects;

public class SegmentEntity implements Serializable {
    private double l;
    private double r;


    public SegmentEntity(){
        l = 0;
        r = 0;
    }

    public SegmentEntity(double l, double r) {
        this.l = l;
        this.r = r;
    }


    public double getL() {
        return l;
    }

    public double getR() {
        return r;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SegmentEntity that = (SegmentEntity) o;
        return Double.compare(that.getL(), getL()) == 0 && Double.compare(that.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getL(), getR());
    }

    @Override
    public String toString() {
        return "SegmentEntity{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }
}
