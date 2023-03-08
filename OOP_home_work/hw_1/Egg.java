package OOP_home_work.hw_1;

import java.sql.Date;

public class Egg extends Food_Product{
    protected int quantityInPackage;

    public Egg (String name, double price, double count, String unitMeasure, Date expirationDate, int quantityInPackage){
        super(name, price, count, unitMeasure, expirationDate);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return "Egg [quantityInPackage=" + quantityInPackage + "]";
    }


    
}
