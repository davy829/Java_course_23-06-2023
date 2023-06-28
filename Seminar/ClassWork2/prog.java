package Seminar.ClassWork2;

public class prog {
    public static void main(String[] args) {
      //System.out.println(  strLenBuild(10, '0', 'g'));
    }

    static String strLenBuild(int n, char c1,char c2){
        StringBuilder mystr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            mystr.append(c1);
            mystr.append(c2);
        }
        return mystr.toString();
    }

    //Напишите метод, который принимает на вход строку (String) и определяет является
    // ли строка палиндромом (возвращает boolean значение).
   // static String polindrom(String s){
   //   StringBuilder mystr = new StringBuilder(s);
        
    
   // }

}
