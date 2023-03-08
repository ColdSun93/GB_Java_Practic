package OOP_home_work.hw_1;



public class Egg extends Food_Product{
    protected int quantityInPackage;

    public Egg (String name, double price, double count, String unitMeasure, String expirationDate, int quantityInPackage){
        super("Яйцо", price, count, unitMeasure, expirationDate);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return "Продукты питания [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure +", Срок хранения=" + expirationDate + ", Количество в упаковке=" + quantityInPackage + "]";
    }


    
}
