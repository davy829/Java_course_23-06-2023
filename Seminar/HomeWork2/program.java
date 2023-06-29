package Seminar.HomeWork2;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;


public class program {

   String pathPrj = System.getProperty("user.dir");
   String pathFile = System.getProperty(pathPrj);
    public static void main(String[] args) throws IOException {
      Logger lg = Logger.getLogger(program.class.getName());
      // ConsoleHandler ch = new ConsoleHandler();
       FileHandler fh = new FileHandler("test.xml");
       lg.addHandler(fh);
       //SimpleFormatter sf = new SimpleFormatter();
       XMLFormatter xml = new XMLFormatter();
       fh.setFormatter(xml);
       lg.log(Level.WARNING,"TEST LOG status OK");
       lg.info("test 2");
        sorArray();
    }
    static void sorArray(){
     int[] arr = new int[] {5,4,3,1,8,7,8,9,6,11} ;
     
     for (int i = 0; i < arr.length; i++) {
        int min = i;
        for (int j = i +1; j < arr.length; j++) {
          if (arr[j] < arr[min]){
            min = j;
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
          }  
        }

    }
}

    


}
