package OOP_home_work.hw_1;

public class program {

    public static void main(String[] args) {
        Product tovar = new Product("Ручка", 10.5, 1, "штука");
        Nipple tNipple = new Nipple(null, 20.0, 1, "штука", 0, true);
        Milk tMilk = new Milk(null, 98.5, 1, "литр", "9 суток", 3.8);
        Mask tMask = new Mask(null, 352.78, 1, "упаковка", 1);
        Lemonade tLemon = new Lemonade(null, 100, 1, "бутылка", 1.5);
        HygieneItems tHygieneItems = new HygieneItems("Шампунь", 235.80, 1, "бутылка", 1);
        Food_Product tFoodProduct = new Food_Product("Масло", 130, 200, "грамм", "180 суток");
        Egg tEgg = new Egg(null, 98.3, 1, "упаковка", "30 суток", 10);
        Drinks tDrinks = new Drinks("Энергетик", 108, 1, "банка", 0.5);
        Diapers tDiapers = new Diapers(null, 1000, 1, "упаковка", 3, true, 2, 0, 10, "на лиручках");
        ChildrenProducts tChildrenProducts = new ChildrenProducts("Игрушка", 30.5, 1, "штука", 3, false);
        Bread tBread = new Bread(null, 80, 1, "булка", "3 суток", "Ржаная");
        Print_Value(tovar, tNipple, tMilk, tMask, tLemon, tHygieneItems, tFoodProduct, tEgg, tDrinks, tDiapers,
                tChildrenProducts, tBread);

    }

    public static void Print_Value(Product tovar, Nipple tNipple, Milk tMilk, Mask tMask, Lemonade tLemon,
            HygieneItems tHygieneItems, Food_Product tFoodProduct, Egg tEgg, Drinks tDrinks, Diapers tDiapers,
            ChildrenProducts tChildrenProducts, Bread tBread) {
        System.out.println(tovar.toString());
        System.out.println(tNipple.toString());
        System.out.println(tMilk.toString());
        System.out.println(tMask.toString());
        System.out.println(tLemon.toString());
        System.out.println(tHygieneItems.toString());
        System.out.println(tFoodProduct.toString());
        System.out.println(tEgg.toString());
        System.out.println(tDrinks.toString());
        System.out.println(tDiapers.toString());
        System.out.println(tChildrenProducts.toString());
        System.out.println(tBread.toString());

    }

}
