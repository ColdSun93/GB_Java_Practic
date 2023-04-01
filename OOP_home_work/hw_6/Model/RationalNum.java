package OOP_home_work.hw_6.Model;

import OOP_home_work.hw_6.Model.Interface.Operations;

public class RationalNum implements Operations {
    protected Double firstNumber;
    protected Double secondNumber;

    public RationalNum (String firstNumber, String secondNumber) {
        this.firstNumber = Double.parseDouble(firstNumber);
        this.secondNumber = Double.parseDouble(secondNumber);
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
