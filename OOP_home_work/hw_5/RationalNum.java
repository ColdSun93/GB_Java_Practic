package OOP_home_work.hw_5;

public class RationalNum implements Operations {
    protected Double firstNumber;
    protected Double secondNumber;

    protected RationalNum (Double firstNumber, Double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    protected RationalNum() {

    }
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public String divElem() {
        Double result = firstNumber / secondNumber;
        return String.format("= %s", result);
    }

    @Override
    public String multiElem() {
        Double result = firstNumber * secondNumber;
        return String.format("= %s", result);
    }

    @Override
    public String subtractionElement() {
        Double result = firstNumber - secondNumber;
        return String.format("= %s", result);
    }

    @Override
    public String sumElement() {
        Double result = firstNumber + secondNumber;
        return String.format("= %s", result);
    }


}
