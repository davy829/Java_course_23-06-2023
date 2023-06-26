import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
/**
 * program
 */
public class program {

    public static void main(String[] args) {
       // whatYuoName();
      // goodday();
     // sameDigit();
     //findmiddle();
     returnWord();
   }
static void whatYuoName()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Inout you name ");
    String data = sc.nextLine();
    System.out.printf("Hello  %s",data);
    sc.close();
}

static void goodday(){
Integer hour = LocalDateTime.now().getHour();
Scanner sc = new Scanner(System.in);
String datetime = "";
System.out.println("What is you name ?");
String name = sc.nextLine();
if (hour > 8 && hour < 11)
datetime = "morning";
else if (hour > 11 && hour < 17)
datetime = "day";
else if (hour > 17 && hour < 21)
datetime = "evening";
else
{
    datetime = "night";
}
System.out.printf("Good %s, %s",datetime,name); 
sc.close();
}

static void sameDigit(){
    //щитаем еденицы подряд
    int[] arr = new int[] {1,1,0,1,1,0,1,1,1,1,1,0};
    int count = 0;
    int max = 0;
   for (int index = 0; index < arr.length; index++)   {
        if (arr[index] == 1) count ++;
        else if (count > max) {
            max = count; 
            count = 0;
        }
        else count = 0;
    }
    if (count > max) max = count;
   System.out.printf("%s \n",max);    
}

static void findmiddle(){
    //сумма элементов с индэксами < i равна >i
int[] array = new int[] {1,7,3,6,5,6};
int leftSumm = 0;
int rightSumm = 0;
for (int i = 1; i< array.length-1; i++) {
    for (int j1 = 0; j1 < i; j1++) {
        leftSumm =+ array[j1];
    }
    for (int j2 = i + 1; j2 < array.length; j2++) {
        rightSumm =+ array[j2];
    }
   if (leftSumm == rightSumm){
   System.out.printf("summL = %s sumR = %s index = %s",leftSumm,rightSumm,i);
   return;
     }   
   }
System.out.println("-1") ;
  }

static void returnWord(){
    Scanner sc = new Scanner(System.in);
    System.out.println("input fraz");
    String fraza = sc.nextLine();
    String[] arr = fraza.split(" ");
    String[] arr2 = new String[arr.length];

    for (int i = 0; i < arr.length; i++) 
        arr2[i] = arr[arr.length -1 - i];

        for (String item : arr2) {
          System.out.println(item);  
        }


sc.close();
}  



}

