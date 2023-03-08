package OOP_home_work.hw_1;

public class ToiletPaper extends HygieneItems {
    protected int numberLayers;

    public ToiletPaper (String name, double price, double count, String unitMeasure, int quantityInPackage, int numberLayers) {
        super(name, price, count, unitMeasure,quantityInPackage);
        this.numberLayers = numberLayers;
    }

    @Override
    public String toString() {
        return "Средства гигиены [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + ", Количество в упаковке=" + quantityInPackage + ", Количество слоев=" + numberLayers + "]";
    }
    

}
