package Seminar.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Seminar4 {
    public static void main(String[] args) {
      /*   ArrayList<Integer> arList = new ArrayList<>();
        makeList(16,arList);
        printMyList(arList);
        delEvenNumbers(arList);
        System.out.println("-");
        printMyList(arList);
        System.out.println("-");
        findMinMax(arList);
        System.out.println("-");
        findMedium(arList);*/


       venera(13);

       
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

    static void venera(int n) {
       // Задание 2
      //   Для списка из задачи про Солнечную систему
      // удалить все повторяющиеся элементы.

        Random rand = new Random();
        List<String> planetList = List.of("Венера", "Юпитер", "Сатурн", "Земля", "Марс", "Плутоний", "Меркурий", "Нептун", "Уран");
        ArrayList<String> randPlanetList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            randPlanetList.add(planetList.get(rand.nextInt(planetList.size())));
            System.out.print(randPlanetList.get(i) + " ");
        }
        System.out.println();
        List myUniqueList = randPlanetList.stream().distinct().collect(Collectors.toList());
      for (int i = 0; i < myUniqueList.size(); i++) {
        System.out.print(myUniqueList.get(i)+" ");
      }
    }

}
