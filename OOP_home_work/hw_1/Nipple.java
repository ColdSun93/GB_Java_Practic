package OOP_home_work.hw_1;

public class Nipple extends ChildrenProducts {

    public Nipple(String name, double price, double count, String unitMeasure, int minAge,
            Boolean hippoalergicity) {
        super("Соска", price, count, unitMeasure,minAge, hippoalergicity);
    }

    @Override
    public String toString() {
        return "Детские продукты [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + ", Минимальный возраст=" + minAge + ", Гиппоалергенность=" + hippoalergicity + "]";
    }
    

}
