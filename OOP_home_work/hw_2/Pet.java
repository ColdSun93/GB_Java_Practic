package OOP_home_work.hw_2;

public interface Pet extends Animal{

    protected String nickname;
    protected String race;
    protected Boolean vaccination;
    protected String coatColor;
    protected String birthdate;

    public String showsAffection();
    
}
