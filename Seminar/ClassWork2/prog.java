package Seminar.ClassWork2;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.StringBuilder;
public class prog {
    public static void main(String[] args) {
      //System.out.println(  strLenBuild(10, '0', 'g'));
      //System.out.println(polindrom("asdo5dsa"));
      System.out.println(makeString("test", 5));
      String pathPrj = System.getProperty("user.dir");
      String pathFile = pathPrj.concat("\\tester2.txt");
      addToFile(pathFile,makeString("pathFile", 10));
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
    FileWriter writer = new FileWriter(myFile);
    writer.write(msg2);
    writer.close();
} catch (Exception e) {
    System.out.println(e.getMessage());
}

}
 
}
