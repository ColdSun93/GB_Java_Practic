package OOP_home_work.hw_3;

public class Square extends Rectangle {

    public Square(Double a) {
        super(a, a);
    }

    public Square() {
        this(2.0);
    }

    @Override
    public String toString() {
        return String.format("Квадрат: %s", super.toString() + " Площадь: " + area() + " Периметр: " + perimeter());
        
        // String.format("Квадрат");
    }

}
