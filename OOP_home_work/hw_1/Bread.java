package OOP_home_work.hw_1;


public class Bread extends Food_Product {
    protected String typeFlour;

    public Bread (String name, double price, double count, String unitMeasure, String expirationDate, String typeFlour) {
        super("Хлеб", price, count, unitMeasure, expirationDate);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return "Продукты питания [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure +", Срок хранения=" + expirationDate + ", Тип муки=" + typeFlour + "]";
    }
    
    
}
