package Homework_java_5;

import java.util.Scanner;

public class hw_wave {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        var map = getMap();
        System.out.println(rawData(getMap()));
        getStrByUser("Введите координаты входа ", map);
        getStrByUser("Введите координаты выхода ", map);
        // System.out.println(map[3][4].getClasgetName());
        // System.out.println(mapColor(getMap()));
        System.out.println(rawData(map));
    }

    static int[][] getMap() {
        return new int[][] {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1, -1, -1, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
    }

    static String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%3d", map[row][col]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void getStrByUser(String text, int[][] map) {
        int[] coordin = new int[2];
        System.out.print(text);
        String coorStr = input.nextLine();
        String[] oper = coorStr.split(" ");
        coordin[0] = Integer.parseInt(oper[0]);
        coordin[1] = Integer.parseInt(oper[1]);
        if ((map[coordin[0]][coordin[1]] == -1) || (map[coordin[0]][coordin[1]] == 2)) {
            getStrByUser("Неверные координаты повторите ввод ", map);
        }
        else {map[coordin[0]][coordin[1]]= 2;}
    }

    // static String mapColor(int[][] map) {
    // StringBuilder sb = new StringBuilder();

    // for (int row = 0; row < map.length; row++) {
    // for (int col = 0; col < map[row].length; col++) {
    // switch (map[row][col]) {
    // case 0:
    // sb.append("\u2764");
    // break;
    // case -1:
    // sb.append("в–“");
    // break;
    // case -2:
    // sb.append("Рљ");
    // break;
    // case -3:
    // sb.append("E");
    // break;
    // default:
    // break;
    // }
    // }
    // sb.append("\n");
    // }
    // for (int i = 0; i < 3; i++) {
    // sb.append("\n");
    // }
    // return sb.toString();
    // }

}
