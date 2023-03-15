package OOP_home_work.hw_3;

import java.lang.Math;

public class Triangle extends Polygon {

    public Triangle(Double a, Double b, Double c) {
        super(new Double[] { a, b, c });
    }

    public Triangle() {
        this(3.0, 3.0, 2.0);
    }

    @Override
    public String toString() {
        return String.format("Треугольник: %s", super.toString() + "Площадь: " + area() + " Периметр: " + perimeter());
        // String.format("Треугольник");
    }

    @Override
    public double area() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

}
