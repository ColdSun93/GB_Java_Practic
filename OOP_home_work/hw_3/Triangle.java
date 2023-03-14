package OOP.seminar_2;

import java.lang.Math;

public class Triangle implements Interface {

    protected Double a;
    protected Double b;
    protected Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double Perimetr_Calculating() {

        Double P = (a + b + c);
        return P;

    }

    @Override
    public Double Area_Calculating() {
        Double p = ((a + b + c) / 2);
        Double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;

    }

    public void printTriangle() {

    }

    @Override
    public String toString() {
        return "Треугольник ";
    }

}
