package OOP_home_work.hw_5;

import java.io.IOException;
import java.util.logging.*;

public class LoggerOperation {

    public static Logger log = Logger.getLogger("Calculated"); //Get the log object
 
    public void initLogger() throws IOException {
        log.setLevel(Level.ALL);//Set the log level of the logger to all, and output all level log information by default.
 
        log.setUseParentHandlers(false); //Disable log original processing class

        FileHandler fileHandler = new FileHandler("OOP_home_work/hw_5/logJUL.log");
        fileHandler.setLevel(Level.ALL); //record level
        log.addHandler(fileHandler); //Add Handler

        log.info("Start"); //Information log
        //log.warning("warning"); //warning log
        log.log(Level.SEVERE,"server"); //Serious log
        //log.fine("fine");
}

    public void info(String string) {
        log.info(string);
    }




    
}
