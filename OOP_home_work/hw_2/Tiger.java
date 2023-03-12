package OOP_home_work.hw_2;

public class Tiger extends WildAnimal {

    protected Tiger(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String habitat,
            String dateLocation) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, habitat, dateLocation);
       
    }

    @Override
    public void makesSounds() {
        System.out.println("РРррр");
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
    }

    
}
