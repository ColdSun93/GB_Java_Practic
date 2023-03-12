package OOP_home_work.hw_2;

public class Stork extends Bird{


    protected Stork(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, Double flightAltitude) {
        super(growthAnimal, weightAnimal, colorEyesAnimal, flightAltitude);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getFlightAltitude());
    }

    @Override
    public void makesSounds() {
        System.out.println("ТТттттт");
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
}
