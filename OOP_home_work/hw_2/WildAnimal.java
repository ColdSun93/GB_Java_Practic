package OOP_home_work.hw_2;

public abstract class WildAnimal extends Animal {
    private String habitat;
    private String dateLocation;

    protected WildAnimal(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String habitat,
            String dateLocation) {
        super(growthAnimal, weightAnimal, colorEyesAnimal);
        this.habitat = habitat;
        this.dateLocation = dateLocation;
    }

    @Override
    public String toString() {
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s",
                this.habitat, this.dateLocation, super.toString());
    }

    @Override
    public abstract void makesSounds();

}
