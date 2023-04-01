package OOP_home_work.hw_6.View;

import java.util.Scanner;
import OOP_home_work.hw_6.LoggerOperation;
import OOP_home_work.hw_6.Presenter.OperationPresenter;

public class ViewMenuUser implements View{
    private OperationPresenter mPresenter;
    private LoggerOperation log;
    

    static void PrintOperation() {
        System.out.println("============Введите операцию===============");
        System.out.println("'+' для сложения");
        System.out.println("'-' для разности");
        System.out.println("'*' для умножения");
        System.out.println("'/' для деления");
        System.out.println("'Q' для выхода");

    }

    @Override
    public void ViewMenu() {
        mPresenter = new OperationPresenter(this);
        log = new LoggerOperation();
        String result = "";
        System.out.println("==========Выберете тип чисел=============");
        System.out.println("1. рациональные");
        System.out.println("2. комплексные");
        System.out.println("3. бинарные");
        try (Scanner input = new Scanner(System.in)) {
            int key = input.nextInt();     

            System.out.print("Введите первое число:\n");
            String firstNumber = input.next();
            log.info(firstNumber);
            System.out.print("Введите второе число:\n");
            String secondNumber = input.next();
            log.info(secondNumber);
            PrintOperation();
            char operation = input.next().charAt(0);
            log.info(String.valueOf(operation));
            result = mPresenter.operationNum(firstNumber, secondNumber, key, operation);
        }
        System.out.println(result);
        log.info(result);
    }

    public static void menuUser(Scanner input, LoggerOperation log2) {

    }

   

}
