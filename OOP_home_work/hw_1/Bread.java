package OOP_home_work.hw_1;

import java.sql.Date;

public class Bread extends Food_Product {
    protected String typeFlour;

    public Bread (String name, double price, double count, String unitMeasure, Date expirationDate, String typeFlour) {
        super(name, price, count, unitMeasure, expirationDate);
        this.typeFlour = typeFlour;
    }
    
}
