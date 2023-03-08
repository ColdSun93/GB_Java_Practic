package OOP_home_work.hw_1;


public class Milk extends Food_Product {
    protected double fatContent;

    public Milk (String name, double price, double count, String unitMeasure, String expirationDate, double fatContent) {
        super("Milk", price, count, unitMeasure, expirationDate);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return "Товар [Молоко=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + "Жирность=" + fatContent + "Срок годности=" + expirationDate + "]";
    }

    
    
}
