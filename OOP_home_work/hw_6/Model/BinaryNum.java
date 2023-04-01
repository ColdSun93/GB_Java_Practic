package OOP_home_work.hw_6.Model;

import OOP_home_work.hw_6.Model.Interface.Operations;

public class BinaryNum implements Operations {

    protected int firstNumber;
    protected int secondNumber;

    public BinaryNum (String Number1, String Number2) {
        
        this.firstNumber = Integer.parseInt(Number1,2);
        this.secondNumber = Integer.parseInt(Number2, 2);
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
        int result = firstNumber / secondNumber;
        return String.format("= %s", Integer.toBinaryString(result));
    }

    @Override
    public String multiElem() {
        int result = firstNumber * secondNumber;
        return String.format("= %s", Integer.toBinaryString(result));
    }

    @Override
    public String subtractionElement() {
        int result = firstNumber - secondNumber;
        return String.format("= %s", Integer.toBinaryString(result));
    }

    @Override
    public String sumElement() {
        int result = firstNumber + secondNumber;
        return String.format("= %s", Integer.toBinaryString(result));
    }
    
    
}
