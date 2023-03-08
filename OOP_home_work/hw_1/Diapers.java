package OOP_home_work.hw_1;

public class Diapers extends ChildrenProducts {
    protected double size;
    protected double minWeight;
    protected double maxWeight;
    protected String type;

    public Diapers(String name, double price, double count, String unitMeasure, int minAge,
            Boolean hippoalergicity, double size, double minWeight, double maxWeight, String type) {
        super(name, price, count, unitMeasure, minAge, hippoalergicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Diapers [size=" + size + ", minWeight=" + minWeight + ", maxWeight=" + maxWeight + ", type=" + type
                + "]";
    }

    
}
