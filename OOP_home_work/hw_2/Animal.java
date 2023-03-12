package OOP_home_work.hw_2;

public abstract class Animal {
    private Double growthAnimal;
    private Double weightAnimal;
    private String colorEyesAnimal;

    public abstract void makesSounds();
    // public String infoAnimals();

    public Animal(Double growthAnimal, Double weightAnimal, String colorEyesAnimal){

    };

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", this.growthAnimal, this.weightAnimal, this.colorEyesAnimal);

    };


    
}
