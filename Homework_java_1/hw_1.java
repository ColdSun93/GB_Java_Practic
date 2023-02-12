package Homework_java_1;
import java.util.Scanner;

public class hw_1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumberByUser("Введите n-ый элемент треугольного числа ");
        System.out.println("Треугольное число = " + Decision(number) + "\n");
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static int Decision(int num) {
        if (num == 1) {
            return 1;
        }
        return Decision(num - 1) + num;
    }

}
