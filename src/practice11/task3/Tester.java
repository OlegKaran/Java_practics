package practice11.task3;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2004, Calendar.MAY, 15);
        Date birthDate = cal.getTime();
        Student student = new Student("Иван", birthDate, 101, 4.75);

        System.out.println(student.getFormattedBirthDate("short"));
        System.out.println(student.getFormattedBirthDate("medium"));
        System.out.println(student.getFormattedBirthDate("full"));
    }
}
