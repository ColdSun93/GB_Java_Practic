package OOP_home_work.hw_2;

public class Cat extends Pet {

    private final Boolean presenceWool;

    protected Cat(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String nickname, String race,
            Boolean vaccination, String coatColor, String birthdate, Boolean presenceWool) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, nickname, race, vaccination, coatColor, birthdate);
        this.presenceWool = presenceWool;
    }

    @Override
    public void makesSounds() {
        System.out.println("Мур-Мур");
    }

    @Override
    public void showsAffection() {
        System.out.println("Кошка хочет ласки!");
    }

    @Override
    public String toString() {
        return String.format("Кот; %s; Наличие шерсти: %s;", 
            super.toString(), this.presenceWool);
    }
    

}
