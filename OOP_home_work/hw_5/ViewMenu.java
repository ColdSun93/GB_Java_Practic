package OOP_home_work.hw_5;

import java.util.Scanner;

public class ViewMenu {

    static void menuUser(Scanner input) {
        System.out.println("==========Выберете тип чисел=============");
        System.out.println("1. рациональные");
        System.out.println("2. комплексные");
        System.out.println("3. рациональные");

        int key = input.nextInt();
        System.out.print("Введите первое число:\n");
        double firstNumber = input.nextDouble();
        System.out.print("Введите второе число:\n");
        double secondNumber = input.nextDouble();


        switch (key) {
            case 1:
                RationalNum rationalNum = new RationalNum(firstNumber, secondNumber);
                menuRationalNum(input, rationalNum);
                break;
            case 2:
                ComplexNum complexNum = new ComplexNum(firstNumber, secondNumber);
                menuComplexNum(input, complexNum);
                break;
            case 3:
                BinaryNum binaryNum = new BinaryNum();
                menuBinaryNum(input, binaryNum);
                break;
            default:
                break;
        }
     
    }

    private static void menuBinaryNum(Scanner input, BinaryNum binaryNum) {
        PrintOperation(); 
        char operation = input.next().charAt(0);
        String result;
        switch (operation) {
            case '+':
            result = binaryNum.sumElement();
                break;
            case '-':
            result = binaryNum.subtractionElement();
                break;
            case '*':
            result = binaryNum.multiElem();
                break;
            case '/':
            result = binaryNum.divElem();
                break;
            case 'Q':
                System.exit(0);
            default:
                System.out.printf("Please enter specified operator only");
                return;
        }
    }

    private static void menuComplexNum(Scanner input, ComplexNum complexNum) {
        PrintOperation(); 
        String result;
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':
            result = complexNum.sumElement();
                break;
            case '-':
            result = complexNum.subtractionElement();
                break;
            case '*':
            result = complexNum.multiElem();
                break;
            case '/':
            result = complexNum.divElem();
                break;
            case 'Q':
                System.exit(0);
            default:
                System.out.printf("Please enter specified operator only");
                return;
        }
    }

    static void PrintOperation() {
        System.out.println("============Введите операцию===============");
        System.out.println("'+' для сложения");
        System.out.println("'-' для разности");
        System.out.println("'*' для умножения");
        System.out.println("'/' для деления");
        System.out.println("'Q' для выхода");

    }

    static void menuRationalNum (Scanner input, RationalNum rationalNum) {
        PrintOperation(); 
        String result;
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':
            result = rationalNum.sumElement();
                break;
            case '-':
            result = rationalNum.subtractionElement();
                break;
            case '*':
            result = rationalNum.multiElem();
                break;
            case '/':
            result = rationalNum.divElem();
                break;
            case 'Q':
                System.exit(0);
            default:
                System.out.printf("Please enter specified operator only");
                return;
        }
        System.out.println("результат " + result);

    }

}
