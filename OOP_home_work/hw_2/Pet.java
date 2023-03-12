package OOP_home_work.hw_2;

public abstract class Pet extends Animal {

    private String nickname;
    private String race;
    private Boolean vaccination;
    private String coatColor;
    private String birthdate;

    protected Pet(Double growthAnimal, Double weightAnimal, String colorEyesAnimal, String nickname, String race,
            Boolean vaccination, String coatColor, String birthdate) {
        super(growthAnimal, weightAnimal, colorEyesAnimal);
        this.nickname = nickname;
        this.race = race;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.birthdate = birthdate;
    }

    @Override
    public abstract void makesSounds();

    @Override
    public String toString() {
        return String.format(
                "Кличка: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;",
                this.nickname, this.race, this.vaccination, this.coatColor, this.birthdate, super.toString());
    }

    public abstract void showsAffection();

}
