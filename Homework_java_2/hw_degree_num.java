package Homework_java_2;

import java.util.Scanner;
import java.io.File;

public class hw_degree_num {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/Homework_java_2/input.txt");
        // int[] dataFile = readDataFile(pathFile);
        int[] dataFile = { 2, 3 };
        System.out.println(dataFile[0]);
        System.out.println(dataFile[1]);
        String result = calculatDegree(dataFile[0], dataFile[1]);
        System.out.println(result);


    }

    public static int[] readDataFile(String pathFile) {
        String msg = "";
        int[] arrAB = new int[2];

        try {
            File file = new File(pathFile);
            Scanner scan = new Scanner(file);
            String[] lineArray = new String[2];
            while (scan.hasNextLine()) {
                msg = scan.nextLine();
                System.out.println(msg);
                lineArray = msg.split(" ");
                System.out.println(lineArray[0]);
                if (lineArray[0] == "a") {
                    System.out.println("lineArray[1]");
                    arrAB[0] = Integer.parseInt(lineArray[1]);
                } else if (lineArray[0] == "b") {
                    arrAB[1] = Integer.parseInt(lineArray[1]);
                }

                // System.out.println(msg);
            }
            scan.close();
            return arrAB;
        } catch (Exception e) {
            System.out.println("reading error");
        }
        return null;

    }

    public static String calculatDegree(int a, int b) {
        double temp = 1;
        int step = 0;
        if (b < 0) {
            step = b * (-1);
        } else if (b == 0) {
            return String.valueOf(temp);
        } else {
            step = b;
        }
        for (int i = 0; i < step; i++) {
            temp *= a;
        }

        if (b < 0) {
            return String.valueOf(1 / temp);
        } else {
            return String.valueOf(temp);
        }
    }



}
