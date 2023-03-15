package OOP_home_work.hw_3;
import java.lang.Math;


public class Circle implements Figure, Circumference {
    private Double rad;

    public Circle(Double rad) {
        this.rad = rad;
    }

    public Circle() {
        this(5.0);
    }
    

    @Override
    public String toString() {
        return String.format("Круг: %s", this.rad + " Площадь: " + area() + " Длина окружности: " + length());
       
        // String.format("Круг");
    }


    @Override
    public Double length() {
        return 2*Math.PI*rad;
    }


    @Override
    public double area() {
        return Math.PI*rad*rad;
    }
}

