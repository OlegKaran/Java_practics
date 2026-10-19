package practice17;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void readFromConsole(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите корректный возраст (число): ");
            scanner.next();
        }
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void display() {
        System.out.println("Студент: " + name + ", Возраст: " + age);
    }
}
