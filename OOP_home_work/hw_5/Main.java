package OOP_home_work.hw_5;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        LoggerOperation log = new LoggerOperation();
        log.initLogger();
        try {
            ViewMenu.menuUser(input, log);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        input.close();
      


    }
}
