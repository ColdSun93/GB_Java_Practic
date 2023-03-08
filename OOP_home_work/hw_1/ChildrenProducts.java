package OOP_home_work.hw_1;

public class ChildrenProducts extends Product {
    protected int minAge;
    protected Boolean hippoalergicity;

    public ChildrenProducts(String name, double price, double count, String unitMeasure, int minAge,
            Boolean hippoalergicity) {
        super(name, price, count, unitMeasure);
        this.minAge = minAge;
        this.hippoalergicity = hippoalergicity;
    }

    @Override
    public String toString() {
        return "Детские продукты [Наименование=" + name + ", Цена=" + price + ", Количество=" + count + ", Ед. измерения=" + unitMeasure + ", Минимальный возраст=" + minAge + ", Гиппоалергенность=" + hippoalergicity + "]";
    }

    
}
