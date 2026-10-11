package practice11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTimeCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год, месяц (1-12) и число через пробел:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("Введите часы (0-23) и минуты через пробел (например: 14 30):");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date date = calendar.getTime();

        System.out.println("\n=== Результаты создания объектов ===");
        System.out.println("Объект Calendar: " + calendar.getTime());
        System.out.println("Объект Date:     " + date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Форматировано:   " + sdf.format(date));

        scanner.close();
    }
}
