package OOP_home_work.hw_3;

import java.util.Arrays;

public abstract class Polygon implements Figure, Perimeterble {
    protected Double[] sides;

    protected Polygon(Double[] sides) {
        this.sides = sides;
    }

    public double perimeter() {
        int sum = 0;
        for (Double side : sides)
            sum += side;
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s", Arrays.toString(sides));
    }

}
