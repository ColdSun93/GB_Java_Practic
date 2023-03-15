package OOP_home_work.hw_3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Scanner input = new Scanner(System.in);
        menuUser(shapes, input);
        input.close();

        // Figure[] figures = { new Triangle(), new Rectangle(), new Circle(), new Square() };
        // for (Figure figure : figures)
        //     printFigureInfo(figure);
    }

    private static void printFigureInfo(Figure figure) {
        System.out.println(figure);
        System.out.println(String.format("Area: %f", figure.area()));
        if (figure instanceof Perimeterble) {
            Perimeterble perimeterable = (Perimeterble) figure;
            System.out.println(String.format("Периметр: %f", perimeterable.perimeter()));
        }
        if (figure instanceof Circumference) {
            Circumference circumference = (Circumference) figure;
            System.out.println(String.format("Length: %f", circumference.length()));
        }
    }

    private static void menuUser(Shapes shapes, Scanner input) {
        System.out.println("Вывести всю информацию - 1");
        System.out.println("Добавить фигуру - 2");
        System.out.println("Удалить фигуру - 3");
        System.out.println("Изменить фигуру - 4");
        System.out.println("Cортировка по площади, вывод информации о всех фигурах - 5");
        System.out.println("Выход - 6");

        int key = input.nextInt();
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
                // viewInfoAllAnimals(shapes, input);
                menuUser(shapes, input);
            case 5:
                // makesSoundsAnimal(shapes, input);
                menuUser(shapes, input);
            case 6:
                break;
        }

    }

    private static void deleteFigure(Shapes shapes, Scanner input) {
        shapes.showAll();
        System.out.printf("%d) Назад\n", Shapes.listShapes.size());
        System.out.print("Введите цифру фигуры: ");
        int key = input.nextInt();
        if (key < Shapes.listShapes.size()) {
            shapes.deleteFigure(key);
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
                shapes.addTriangle(input);
                ;
                menuUser(shapes, input);
            case 2:
                shapes.addRectangle(input);
                menuUser(shapes, input);
            case 3:
                shapes.addCircle(input);
                menuUser(shapes, input);
            case 4:
                shapes.addSquare(input);
                menuUser(shapes, input);
            case 5:
                menuUser(shapes, input);
        }
    }
}
