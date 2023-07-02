package Seminar.HomeWork;

import java.util.Scanner;

/**
 * program
 */
public class Seminar1 {

    public static void main(String[] args) {
      // 1) System.out.println(triangleDigit(12)); //треугольные числа
     //  2) simpleDigit(1000); // простые числа
    //   3) System.out.println(userInput()); //калькулятор

    }

    static Integer triangleDigit(int n){
        //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        int summ = 0;
        for (int i = 1; i < n; i++) {
           summ = summ + i; 
        }
        return summ;
    }

static void simpleDigit(int s){
    StringBuilder sb = new StringBuilder();
    sb.append("2,");
    int r = 1;
for (int j = 0; j < 4; j++) {
        r = r + 2;
     if (r != 9) {
     sb.append(r);
     sb.append(",");
     }
}
for (int i = 0; i < s; i++) {
     if (i !=1 & i % 2 != 0 & i % 3 != 0 & i %5 !=0 & i % 7 !=0){
   

    sb.append(i);
    sb.append(",");
     }
    }
System.out.println(sb);
}

static String userInput(){
Scanner sc = new Scanner(System.in);
System.out.println("введите выржение например (2 * 4) ");//приглашение на ввод
String userWhantCount = sc.nextLine(); // читаем что ввел 
sc.close(); // закрыли сканер
return calc(userWhantCount); //позвали калькулятор и передали что ввел

}

static String calc(String n){
    //калькулятор
    String res = "";
    int plus = 43;// +
    int minus = 45;// -
    int div = 47;// /
    int umn = 42; // * 
    if (n.length() == 3){
    String first = Character.toString(n.charAt(0)); // первый символ строки
    String second = Character.toString(n.charAt(2)); // третий символ строки
    int firsInt = Integer.parseInt(first ); // в интегер первый
    int secondInt = Integer.parseInt(second); // в интегер второй
    if  (n.charAt(1) == (char) div){ // если средний символ деление дальше делим
    int res1 = firsInt / secondInt;
    res = Integer.toString(res1);
      }
      if  (n.charAt(1) == (char) plus){ // если стредний плюс складываем
        int res1 = firsInt + secondInt;
        res = Integer.toString(res1);
      }
      if  (n.charAt(1) == (char) minus){ //если минус
        int res1 = firsInt - secondInt;
        res = Integer.toString(res1);
      }
      if  (n.charAt(1) == (char) umn){ // если умножить
        int res1 = firsInt * secondInt;
        res = Integer.toString(res1);
      }
   }
    return "ответ " + res; // возвращаем резульат
 }
}