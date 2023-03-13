package OOP_home_work.hw_2;

import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        ZooPark animals = new ZooPark();
        Scanner input = new Scanner(System.in);
        menuUser(animals, input);
        input.close();

    }

    private static void menuUser(ZooPark animals, Scanner input) {
        System.out.println("Добавить животное - 1");
        System.out.println("Удалить животное - 2");
        System.out.println("Просмотреть информацию о конкретном животном - 3");
        System.out.println("Просмотреть информацию о всех животных в зоопарке - 4");
        System.out.println("Заставить животное издать звук - 5");
        System.out.println("Заставить всех животных издать звук - 6");
        System.out.println("Выход - 7");

        int key = input.nextInt();
        switch (key) {
            case 1:
                addAnimal(animals, input);
                menuUser(animals, input);
            case 2:
                deleteAnimal(animals, input);
                menuUser(animals, input);
            case 3:
                viewInfoAnimal(animals, input);
                menuUser(animals, input);
            case 4:
                viewInfoAllAnimals(animals, input);
                menuUser(animals, input);
            case 5:
                makesSoundsAnimal(animals, input);
                menuUser(animals, input);
            case 6:
                makesSoundsAnimals(animals, input);
                menuUser(animals, input);
            case 7:
                break;
        }

    }

    private static void makesSoundsAnimals(ZooPark animals, Scanner input) {
        menuUser(animals, input);
    }

    private static void makesSoundsAnimal(ZooPark animals, Scanner input) {
        menuUser(animals, input);
    }

    private static void viewInfoAllAnimals(ZooPark animals, Scanner input) {
        menuUser(animals, input);
    }

    private static void viewInfoAnimal(ZooPark animals, Scanner input) {
        menuUser(animals, input);
    }

    private static void deleteAnimal(ZooPark animals, Scanner input) {
        menuUser(animals, input);
    }

    private static void addAnimal(ZooPark animals, Scanner input) {
        menuUser(animals, input);

    }

}
