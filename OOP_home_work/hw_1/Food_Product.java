package OOP_home_work.hw_1;



public class Food_Product extends Product {
    protected String expirationDate;

    public Food_Product(String name, double price, double count, String unitMeasure, String expirationDate) {
        super(name, price, count, unitMeasure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Продукты питания [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + ", Срок хранения=" + expirationDate + "]";
    }

    

}
