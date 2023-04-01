package OOP_home_work.hw_6.Presenter;

import java.io.IOException;
import java.util.Scanner;

import OOP_home_work.hw_6.LoggerOperation;
import OOP_home_work.hw_6.Model.BinaryNum;
import OOP_home_work.hw_6.Model.ComplexNum;
import OOP_home_work.hw_6.Model.RationalNum;
import OOP_home_work.hw_6.Model.Interface.Operations;
import OOP_home_work.hw_6.View.View;

import OOP_home_work.hw_6.View.ViewMenuUser;

public class OperationPresenter {

    private View mView;
    private Operations operations;


    public OperationPresenter(View mView) {
        this.mView = mView;
        this.operations = operations;
    }

    public void buttonClick(Scanner input, LoggerOperation log) throws IOException {
        ViewMenuUser.menuUser(input, log);

    }

    public String operationNum(String firstNumber, String secondNumber, int key, char operation) {
        switch (key) {
            case 1:
                operations = new RationalNum(firstNumber, secondNumber);
                break;
            case 2:
                operations = new ComplexNum(firstNumber, secondNumber);
                break;
            case 3:
                operations = new BinaryNum(firstNumber, secondNumber);

                break;
            default:
                break;
        }
        return menuRationalNum(operation, operations);

    }

    static String menuRationalNum(char operation, Operations operations) {
        String result;
        switch (operation) {
            case '+':
                result = operations.sumElement();
                break;
            case '-':
                result = operations.subtractionElement();
                break;
            case '*':
                result = operations.multiElem();
                break;
            case '/':
                result = operations.divElem();
                break;
            case 'Q':
                System.exit(0);
            default:
                return String.format("Please enter specified operator only");
        }
        return String.format("результат %s", result);
    }

}
