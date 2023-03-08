package OOP_home_work.hw_1;

public class Product {
    
    protected String name;
    protected double price;
    protected double count;
    protected String unitMeasure;

    public Product (String name, double price, double count,String unitMeasure) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unitMeasure = unitMeasure;
    }

    @Override
    public String toString() {
        return "Товар [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + "]";
    }
    
}
