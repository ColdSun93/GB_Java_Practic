package OOP_home_work.hw_1;

public class HygieneItems extends Product {
    protected int quantityInPackage;

    public HygieneItems(String name, double price, double count, String unitMeasure, int quantityInPackage) {
        super(name, price, count, unitMeasure);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return "HygieneItems [quantityInPackage=" + quantityInPackage + "]";
    }

}
