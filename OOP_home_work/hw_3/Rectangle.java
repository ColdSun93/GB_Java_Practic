package OOP_home_work.hw_3;

public class Rectangle extends Polygon{

    public Rectangle(Double a, Double b) {
        super(new Double[]{a,b,a,b});
    }

    public Rectangle() {
        this(2.0, 4.0);
    }


    @Override
    public String toString() {
        return String.format("Прямоугольник: %s", super.toString() + " Площадь: " + area() + " Периметр: " + perimeter());
        
        // String.format("Прямоугольник");
        
    }




    @Override
    public double area() {
        return sides[0]*sides[1];
    }
}
