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
            System.out.print(arr[j] + ",");
        }
    }

    static void venera(int n) {
        Random rand = new Random();
        List<String> planetList = List.of("Венера", "Юпитер", "Сатурн", "Земля", "Марс", "Плутоний", "Меркурий", "Нептун", "Уран");
        ArrayList<String> randPlanetList = new ArrayList<>(n);
        int[] count = new int[planetList.size()];

        for (int i = 0; i < n; i++) {
            randPlanetList.add(planetList.get(rand.nextInt(planetList.size())));
            System.out.print(randPlanetList.get(i) + " ");
            count[planetList.indexOf(randPlanetList.get(i))]++;
        }
        System.out.println();
        for (int index = 0; index < randPlanetList.size(); index++) {
        //System.out.printf("%s - %s \n",randPlanetList.get(index),count[index]);
        System.out.print(count[index]+" ");
        }
    }

}
