package OOP_home_work.hw_1;

import java.sql.Date;

public class Milk extends Food_Product {
    protected double fatContent;

    public Milk (String name, double price, double count, String unitMeasure, Date expirationDate, double fatContent) {
        super(name, price, count, unitMeasure, expirationDate);
        this.fatContent = fatContent;
    }
    
}
