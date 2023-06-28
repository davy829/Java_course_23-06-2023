package Lection;
import java.time.LocalDateTime;
public class StrBlding {
    public static void main(String[] args) {
       // sbld();   
    }

    static void sbld(){
    
    StringBuilder sb = new StringBuilder();
    int sec = LocalDateTime.now().getSecond();
    for (int i =0; i < 1000000;i++){
        sb.append("+");
    }
    int sec2 = LocalDateTime.now().getSecond();
    System.out.printf("sec1 =%s sec2=%s " , sec,sec2);

    }


}
/*concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках*/
