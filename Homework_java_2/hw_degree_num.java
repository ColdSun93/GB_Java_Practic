package Homework_java_2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class hw_degree_num {

    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFileIn = pathProject.concat("/Homework_java_2/input.txt");
        String pathFileOut = pathProject.concat("/Homework_java_2/output.txt");
        int[] dataFile = readDataFile(pathFileIn);
        String result = calculatDegree(dataFile[0], dataFile[1]);
        writeDataFile(result, pathFileOut);
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
                lineArray = msg.split(" ");
                if (lineArray[0].equals("a")) {
                    arrAB[0] = Integer.parseInt(lineArray[1]);
                } else if (lineArray[0].equals("b")) {
                    arrAB[1] = Integer.parseInt(lineArray[1]);
                }
            }
            scan.close();
            return arrAB;
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public static void writeDataFile(String wrResult, String pathFile) {
        try (FileWriter wfile = new FileWriter(pathFile, false)) {
            wfile.write(wrResult);
            wfile.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
