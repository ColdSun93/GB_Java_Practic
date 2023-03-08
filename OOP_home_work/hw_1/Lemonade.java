package OOP_home_work.hw_1;

public class Lemonade extends Drinks{
    
    public Lemonade (String name, double price, double count, String unitMeasure, double size) {
        super(name, price, count, unitMeasure, size);

    }

    @Override
    public String toString() {
        return "Lemonade []";
    }

    
}
