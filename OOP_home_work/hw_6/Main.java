package OOP_home_work.hw_6;

import java.io.IOException;
import java.util.Scanner;
import OOP_home_work.hw_6.View.ViewMenuUser;

public class Main {

    private static LoggerOperation log;
    private static ViewMenuUser viewMenuUser;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        log = new LoggerOperation();
        log.initLogger();
        viewMenuUser= new ViewMenuUser();
        viewMenuUser.ViewMenu();
        input.close();  
    }
    
}
