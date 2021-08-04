
import java.util.logging.FileHandler;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J.Rpc
 */
public class BaseClass{
    
    final static Logger logger = Logger.getLogger(BaseClass.class);
   
    public static void main(String args[]){
       String name =  JOptionPane.showInputDialog("Enter your name");
       logger.info("\n"+"Name has been Entered" + "\t" + "Value = " + name);
       int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
       logger.info("\n"+"Age has been Entered" +"\t"+"Value ="+ Age);
    }
}
