package Seminar.HomeWork;

import java.util.ArrayList;

public class Seminar4 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        makeList(16,arList);
        printMyList(arList);
        delEvenNumbers(arList);
        System.out.println("-");
        printMyList(arList);
        System.out.println("-");
        findMinMax(arList);
        System.out.println("-");
        findMedium(arList);

    }

    /*
     * Задание 1
     * 1.Пусть дан произвольный список целых чисел.
     * 1) Нужно удалить из него чётные числа
     * 2) Найти минимальное значение
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     */
    public static void makeList(int n, ArrayList<Integer> mylist){
        for (int i = 1; i < n; i++) {
        mylist.add(i);    
        }

     }
      public static void printMyList(ArrayList<Integer> myList){
      for (Integer itm : myList) {
        System.out.print(itm+",");
      }
      }

     public static void delEvenNumbers(ArrayList<Integer> myList){
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) % 2 == 0) {
             myList.remove(index);
            }
        }
     }

     public static void findMinMax(ArrayList<Integer> myList){
        int min = myList.get(1);
        int max = myList.get(1);
        ;
        for (int itm :myList) {
            if (itm > max) {
                max = itm;
            }
            if (itm < min) {
                min = itm;
            }
        }
        System.out.printf("min value = %s, max value = %s", min, max);
     }

     public static void findMedium(ArrayList<Integer> myList){
             
       int summ = 0;
        int medium = 0;
        for (int index = 0; index < myList.size(); index++) {
            summ = summ + myList.get(index);
        }
        medium = summ / myList.size();
        System.out.printf("среднее = %s. summ = %s . кол-во элементов = %s",medium, summ, myList.size());
    }

}
