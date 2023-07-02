package Seminar.HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Seminar2 {

  
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        //outputDir(findFiles(pathPrj));  // задача 1)
     // sortArray(); // задача 2)
  
    }
    static void sortArray() throws SecurityException, IOException{
      String pathPrj = System.getProperty("user.dir");
      String pathFile2 = pathPrj.concat("\\tester34.txt"); 
     StringBuilder sb = new StringBuilder();
     Integer[] arr = new Integer[] {9,8,7,6,5,4,3,2,1,0} ;
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
  for (int k : arr) {
        sb.append(arr[k]+",");
        System.out.println(arr[k]);
      
      }    
    
      writeLogFile(pathFile2, sb.toString()); 
    
}


static void writeLogFile(String fileNme, String myList) throws SecurityException, IOException{
  //2) Реализуйте алгоритм сортировки пузырьком числового массива, результат 
  //  после каждой итерации запишите в лог-файл.
  Logger log = Logger.getLogger(Seminar2.class.getName());
   FileHandler fh = new FileHandler("HomeWork(log).txt");
  log.addHandler(fh);
  //SimpleFormatter simple = new SimpleFormatter();
 // fh.setFormatter(simple);
 XMLFormatter xml = new XMLFormatter();
 fh.setFormatter(xml);
try {
  File myFile = new File(fileNme);
  Writer fr = new FileWriter(myFile);
  File myWr = new File("myList.txt");     // файл не существует для ошибки 
  BufferedReader fileRead = new BufferedReader(new FileReader(myWr));  // для ошибки 
  fr.write(myList);

  fr.close();
  String line = fileRead.readLine(); // для ошибки 
  fileRead.close();                     // для ошибки 
 } catch (Exception e) {
  log.warning(e.getMessage());
}

}
    
static String[] findFiles(String filePath){
File myFile = new File(filePath);
return myFile.list();
}

static void outputDir(String[] myLst){
//1) Напишите метод, который определит тип (расширение) файлов из 
//  текущей папки и выведет в консоль результат вида
StringBuilder sb = new StringBuilder();
for (String item : myLst) {
  int index1 = item.indexOf('.');
   if (index1 > -1 ){
     System.out.println("it is file  "+item.substring(index1, item.length()));
   }
   else
   {
    System.out.println("it is DIR   "+item);
   }

}


}




}


