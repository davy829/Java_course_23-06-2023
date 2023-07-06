package Seminar.ClassWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Seminar3 {
    public static void main(String[] args) {
       // fillArray(10); //создать масиф призвольными и отсотрить
        venera(5);
        
    }

    static void fillArray(Integer n) {
        Integer[] arr = new Integer[n];
        Random rn = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1, 9);
        }

        for (int item : arr) {
            System.out.print(item + ",");
        }
        Arrays.sort(arr);
        System.out.println("----");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+",");
        }
    }


static void venera(int n){
    Random rd = new Random();
    List<String> myList = List.of("Венера","Юпитер","Сатурн","Земля",
    "Марс","Плутоний","Меркурий","Нептун","Уран");
    String ms = (String) myList.get(rd.nextInt(0,8));
  //  System.out.println(ms);
   // System.out.println(myList.indexOf(ms));
    ArrayList<String> arLst = new ArrayList<>();
    ArrayList<String> arLst2 = new ArrayList<>();
   for (int i = 0; i < n; i++) {
     arLst.add(myList.get(rd.nextInt(0,8)));
   }
   

    for (String itm : arLst) {
       System.out.println(itm+","); 
    }
    int count = 0;
    for (String itm2 : arLst) {
        for (int i = 0; i < myList.size(); i++) {
       if (itm2 == myList.get(i)){
        count++;
       if (i == myList.size() -1 ) arLst2.add(myList.get(i) + Integer.toString(count));
       }  
       }
      count = 0;
    }
    for (String itm3 : arLst2) {
        System.out.println(itm3+"*");
    }
}



}
