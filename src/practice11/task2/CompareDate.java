package practice11.task2;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CompareDate {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
         System.out.println("Введите дату и время в формате (дд.мм.гггг чч:мм:сс):");
         String inputDate = sc.nextLine();
         try {
             Date userDate = formatter.parse(inputDate);
             Date currentDate = new Date();
             System.out.println("Текущее время: " + formatter.format(currentDate));
             System.out.println("Введенное время: " + formatter.format(userDate));
             int result = userDate.compareTo(currentDate);
             if (result > 0) {
                 System.out.println("Введенная дата в будущем");
             } else if  (result < 0) {
                 System.out.println("Введенная дата в прошлом");
             } else {
                 System.out.println("Введенная дата совпадает");
             }
         }
         catch (ParseException e) {
             System.out.println("Ошибка: неверный формат");
         }
         finally {
             sc.close();
         }
     }
}
