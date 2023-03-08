package OOP_home_work.hw_1;

public class Mask extends HygieneItems {

    public Mask (String name, double price, double count, String unitMeasure, int quantityInPackage) {
        super("Маска", price, count, unitMeasure,quantityInPackage);
    }

    @Override
    public String toString() {
        return "Средства гигиены [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + ", Количество в упаковке=" + quantityInPackage + "]";
    }

   
    
}
