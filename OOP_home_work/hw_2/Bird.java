package OOP_home_work.hw_2;

public abstract class Bird extends Animal{
    
    private Double flightAltitude;

    public void fly() {
        System.out.println("Я лечу на %d" + flightAltitude + " метрах");
        
    }

    private void getInfo(Double flightAltitude) {
        this.flightAltitude = flightAltitude;
    } 


    
}
