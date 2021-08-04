
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.*;

/**
 *
 * @author J.Rpc
 */

class Name{
    String first;
    String last;
    
    public Name(String f,String l){
        first = f;
        last = l;
    }
    
    @Override
    public String toString(){
        return first + " " + last + "\n";
    }
}
public class LogTest {
     final static Logger logger = Logger.getLogger(LogTest.class); // creating instance of logger
     
    public static void main(String args[]){
       Name one = new Name("Kushagra","Singh");
       Name two = new Name("mogli","Singh");
         try {
             PropertyConfigurator.configure("log4j.properties");
         } catch (Exception ex) {
            System.out.println(ex);
         }
       List<Name> names = Arrays.asList(one,two);
       logger.info(names);
        logger.debug("Debug Statement");
        logger.info("Info Statement");
        logger.warn("Warn Message");
        logger.error("Error Message");
        logger.fatal("fatal message");
    }
}
