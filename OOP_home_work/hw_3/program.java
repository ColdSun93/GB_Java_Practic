package OOP_home_work.hw_3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Scanner input = new Scanner(System.in);
        menuUser(shapes, input);
        input.close();

       
    }

    private static void addTriangle(Shapes shapes, Scanner input) {
        Double a;
        Double b;
        Double c;

        try {
            System.out.print("Cторона a: ");
            a = input.nextDouble();
            System.out.print("Cторона b: ");
            b = input.nextDouble();
            System.out.print("Cторона c: ");
            c = input.nextDouble();
            
            shapes.addTriangleShapes(a, b, c);

        } catch (Exception e) {
            System.out.print("Неверный ввод: ");
            addTriangle(shapes,input);
        }

    }

    private static void menuUser(Shapes shapes, Scanner input) {
        System.out.println("Вывести всю информацию - 1");
        System.out.println("Добавить фигуру - 2");
        System.out.println("Удалить фигуру - 3");
        System.out.println("Изменить фигуру - 4");
        System.out.println("Cортировка по площади, вывод информации о всех фигурах - 5");
        System.out.println("Выход - 6");
        int key = 6;

        try {
            key = input.nextInt();

        } catch (Exception e) {
            System.out.print("Неверный ввод: ");
            menuUser(shapes, input);
        }

        switch (key) {
            case 1:
                shapes.showAll();
                menuUser(shapes, input);
            case 2:
                addFigure(shapes, input);
                menuUser(shapes, input);
            case 3:
                deleteFigure(shapes, input);
                menuUser(shapes, input);
            case 4:
                setFigure(shapes, input);
                menuUser(shapes, input);
            case 5:
                menuUser(shapes, input);
            case 6:
                break;
        }

    }

    private static void setFigure(Shapes shapes, Scanner input) {
        shapes.showAll();
        System.out.printf("%d) Назад\n", Shapes.listShapes.size());
        System.out.print("Введите цифру изменяемой фигуры: ");
        int key = input.nextInt();
        if (key < Shapes.listShapes.size()) {
            addFigure(shapes, input);
            shapes.setShapes(key);
            System.out.println("Фигура изменена");
            menuUser(shapes, input);
        } else
            menuUser(shapes, input);
    }

    private static void deleteFigure(Shapes shapes, Scanner input) {
        shapes.showAll();
        System.out.printf("%d) Назад\n", Shapes.listShapes.size());
        System.out.print("Введите цифру фигуры: ");
        int key = input.nextInt();
        if (key < Shapes.listShapes.size()) {
            shapes.deleteShapes(key);
            System.out.println("Фигура удалена");
            menuUser(shapes, input);
        } else
            menuUser(shapes, input);

    }

    private static void addFigure(Shapes shapes, Scanner input) {
        System.out.println("1. Добавить треугольник");
        System.out.println("2. Добавить прямоугольник");
        System.out.println("3. Добавить круг");
        System.out.println("4. Добавить квадрат");
        System.out.println("5. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addTriangle(shapes, input);
                addFigure(shapes, input);
            case 2:
                addRectangle(shapes, input);
                addFigure(shapes, input);
            case 3:
                addCircle(shapes, input);
                addFigure(shapes, input);
            case 4:
                addSquare(shapes, input);
                addFigure(shapes, input);
            case 5:
                menuUser(shapes, input);
        }
        addFigure(shapes, input);
    }

    private static void addSquare(Shapes shapes, Scanner input) {
        Double a;

        try {
            System.out.print("Cторона a: ");
            a = input.nextDouble();

            shapes.addSquareShapes(a);

        } catch (Exception e) {
            System.out.print("Неверный ввод: ");
            addSquare(shapes,input);
        }

    }

    private static void addCircle(Shapes shapes, Scanner input) {
        Double r;

        try {
            System.out.print("Cторона a: ");
            r = input.nextDouble();

            shapes.addCircleShapes(r);

        } catch (Exception e) {
            System.out.print("Неверный ввод: ");
            addCircle(shapes,input);
        }

    }

    private static void addRectangle(Shapes shapes, Scanner input) {
        Double a;
        Double b;

        try {
            System.out.print("Cторона a: ");
            a = input.nextDouble();
            System.out.print("Cторона b: ");
            b = input.nextDouble();
           
            shapes.addRectangleShapes(a, b);

        } catch (Exception e) {
            System.out.print("Неверный ввод: ");
            addRectangle(shapes,input);
        }

    }
}
