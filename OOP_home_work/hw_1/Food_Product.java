package OOP_home_work.hw_1;

import java.sql.Date;

public class Food_Product extends Product {
    protected Date expirationDate;

    public Food_Product(String name, double price, double count, String unitMeasure, Date expirationDate) {
        super(name, price, count, unitMeasure);
        this.expirationDate = expirationDate;
    }

}
