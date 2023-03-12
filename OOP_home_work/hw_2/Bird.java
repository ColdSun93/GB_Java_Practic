package OOP_home_work.hw_2;

public abstract class Bird extends Animal{
    protected Double flightAltitude;

    protected Bird(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, Double flightAltitude) {
        super(growthAnimal, weightAnimal, colorEyesAnimal);
        this.flightAltitude = flightAltitude;
    }

    

    public abstract void toFly();

    public Double getFlightAltitude() {
        return this.flightAltitude;
    } 


    
}
