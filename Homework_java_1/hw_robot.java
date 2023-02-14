package Homework_java_1;

import java.util.Scanner;

public class hw_robot {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numA = getNumberByUser("Введите числа а (а - натурально, целое число) ");
        int numB = getNumberByUser("Введите числа b (b - натурально, целое число, b>a) ");
        String operC = getStrByUser("Введите операцию d (при операции d, число a -> b) ");
        String operD = getStrByUser("Введите операцию c (d>c) ");

        // System.out.println(number + "-ый элемент треугольного числа = " +
        // Decision(number) + "\n");
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static String getStrByUser(String text) {
        System.out.print(text);
        return input.nextLine();
    }

}
