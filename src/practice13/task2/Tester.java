package practice13.task2;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Карановский", "Олег", "Игоревич");
        System.out.println("Полное ФИО: " + p1.getFullName());
        Person p2 = new Person("Иванов");
        System.out.println("Полное ФИО: " + p2.getFullName());
    }
}
