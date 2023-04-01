package OOP_home_work.hw_6.Model;

import OOP_home_work.hw_6.Model.Interface.Operations;

public class ComplexNum implements Operations {

    protected Double firstNumber;
    protected Double secondNumber;

    public ComplexNum (String firstNumber, String secondNumber) {
        this.firstNumber = Double.parseDouble(firstNumber);
        this.secondNumber = Double.parseDouble(secondNumber);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public String divElem() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String multiElem() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String subtractionElement() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String sumElement() {
        // TODO Auto-generated method stub
        return null;
    }
    

}
