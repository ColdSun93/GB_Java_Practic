package OOP_home_work.hw_2;

public class Wolf extends WildAnimal {
    private Boolean packLeader;

    protected Wolf(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String habitat, String dateLocation, Boolean packLeader) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, habitat, dateLocation);
        this.packLeader = packLeader;
    }

    @Override
    public void makesSounds() {
        System.out.println("ААуууу");
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.packLeader);
    }
    
}
