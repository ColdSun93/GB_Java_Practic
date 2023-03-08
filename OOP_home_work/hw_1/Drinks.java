package OOP_home_work.hw_1;

public class Drinks extends Product {
    protected double size;

    public Drinks(String name, double price, double count, String unitMeasure, double size) {
        super(name, price, count, unitMeasure);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Напитки [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + "Объем=" + size + "]";
    }

    

}
