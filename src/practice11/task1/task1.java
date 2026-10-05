package practice11.task1;
import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        String taskReceiveTask = "02.09.2026 10:00:00";
        Date now = new Date();
        System.out.println("Фамилия: Карановский");
        System.out.println("Дата и время получения задания: " + taskReceiveTask);
        System.out.println("Дата и время сдачи задания" + now);
    }
}
