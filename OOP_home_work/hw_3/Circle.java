package OOP.seminar_2;
import java.lang.Math;

public class Circle implements Interface{
    protected int r;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public Double Area_Calculating() {
        Double S = Math.PI* Math.pow(r, 2);
        return S;

    }


    @Override
    public Double Perimetr_Calculating() {
        Double P = 2*Math.PI* r;
        return P;
    }


    @Override
    public String toString() {
        return "Circle ";
    }
}

