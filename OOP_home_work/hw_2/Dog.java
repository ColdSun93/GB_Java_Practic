package OOP_home_work.hw_2;

public class Dog extends Pet {
    private Boolean trained;

    protected Dog(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String nickname, String race,
            Boolean vaccination, String coatColor, String birthdate, Boolean trained) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, nickname, race, vaccination, coatColor, birthdate);
        this.trained = trained;
    }

    public void toTrain() {
        System.out.println("Дрессировка");

    }

    @Override
    public String toString() {
        return String.format("Собака; %s; Наличие дресировки: %s", super.toString(), this.trained);
    }

    @Override
    public void makesSounds() {
        System.out.println("Собака сказала - Гав-гав");
    }

    @Override
    public void showsAffection() {
        System.out.println("Погладь меня");
    }
}
