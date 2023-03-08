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
}
