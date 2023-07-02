package Seminar.ClassWork;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Seminar2 {
    public static void main(String[] args) throws SecurityException, IOException {
      //System.out.println(  strLenBuild(10, '0', 'g'));
      //System.out.println(polindrom("asdo5dsa"));
     // System.out.println(makeString("DAvy", 5));
      String pathPrj = System.getProperty("user.dir");
      String pathFile1 = pathPrj.concat("\\tester2.txt");
      String pathFile2 = pathPrj.concat("\\tester3.txt");
      //addToFile(pathFile1,makeString("test davy", 10));
      writeToFile(pathFile2,findFilesInDirectory(pathPrj));
    }

    static String strLenBuild(int n, char c1,char c2){
        StringBuilder mystr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            mystr.append(c1);
            mystr.append(c2);
        }
        return mystr.toString();
    }

 
    static String polindrom(String s){
       //Напишите метод, который принимает на вход строку (String) и определяет является
    // ли строка палиндромом (возвращает boolean значение).    
       for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != s.charAt(s.length() - i-1))
         return s + " No polindrom";      
       }
       return s +" yes plindrom" ;
    }

 static String makeString(String s, int lenStr){
   StringBuilder sb = new StringBuilder();
  for (int i = 0; i < lenStr; i++) {
    sb.append(i);
    sb.append(") "+ s + "\n");

  
  }
  return sb.toString();

 }

static void addToFile(String fileName, String msg2){
try {
    File myFile = new File(fileName);
    FileWriter writer = new FileWriter(myFile,true); //дописывает файл второй аргумент !
    writer.write(msg2);
    writer.close();
} catch (Exception e) {
    System.out.println(e.getMessage());
}

}
 
static String[] findFilesInDirectory(String dirPath){
  File myDir = new File(dirPath);
 return  myDir.list();
 
}



static void writeToFile(String fileName,String[] mylist )throws SecurityException, IOException{
Logger log = Logger.getLogger(Seminar2.class.getName());
FileHandler fh = new FileHandler("ClassWork2(log).txt");
log.addHandler(fh);
SimpleFormatter simple = new SimpleFormatter();
fh.setFormatter(simple);
try {
  File myFile = new File(fileName);
  FileWriter fr = new FileWriter(myFile);
  for (String str : mylist) {
    fr.write(str + "\n");
  }
  fr.close();

} catch (Exception e) {
  log.warning(e.getMessage());
}
}

}