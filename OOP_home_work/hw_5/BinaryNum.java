package OOP_home_work.hw_5;

public class BinaryNum implements Operations {

    protected int firstNumber;
    protected int secondNumber;

    protected BinaryNum (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    protected BinaryNum () {
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public String divElem() {
        // TODO Auto-generated method stub
        return String.format("= %s", "result");
    }

    @Override
    public String multiElem() {
        // TODO Auto-generated method stub
        return String.format("= %s", "result");
    }

    @Override
    public String subtractionElement() {
        // TODO Auto-generated method stub
        return String.format("= %s", "result");
    }

    @Override
    public String sumElement() {
        int result = firstNumber + secondNumber;
        return String.format("= %s", "result");
    }
    
    
}
