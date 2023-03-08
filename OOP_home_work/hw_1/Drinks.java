package OOP_home_work.hw_1;

public class Drinks extends Product {
    protected double size;

    public Drinks(String name, double price, double count, String unitMeasure, double size) {
        super(name, price, count, unitMeasure);
        this.size = size;
    }

}
