package practice19.task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClassInterface labClass;
    private Scanner scanner;

    public LabClassUI(LabClassInterface labClass) {
        this.labClass = labClass;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Вывести список студентов");
            System.out.println("2. Отсортировать по среднему баллу (GPA)");
            System.out.println("3. Найти студента по ФИО");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    printStudents();
                    break;
                case "2":
                    labClass.sortByGPA();
                    System.out.println("Список успешно отсортирован по убыванию GPA.");
                    printStudents();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Неверный пункт меню.");
            }
        }
    }

    private void printStudents() {
        System.out.println("\nСписок студентов:");
        for (Student s : labClass.getStudents()) {
            System.out.println(s);
            System.out.println("-----------------");
        }
    }

    private void searchStudent() {
        System.out.print("Введите ФИО для поиска: ");
        String name = scanner.nextLine();

        try {
            Student found = labClass.findByName(name);
            System.out.println("\nНайден студент:\n" + found);
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
