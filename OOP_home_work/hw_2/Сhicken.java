package OOP_home_work.hw_2;

public class Сhicken extends Bird{

    protected Сhicken(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, Double flightAltitude) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, flightAltitude);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getFlightAltitude());
    }

    @Override
    public void makesSounds() {
        System.out.println("Куд-Кудах");
    }

    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
    
}
