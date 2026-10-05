package practice2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите вместимость магазина: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        Shop shop = new Shop(capacity);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Computer c = new Computer();
                    c.inputData(sc);
                    shop.addComputer(c);
                    break;
                case 2:
                    System.out.print("Введите модель для удаления: ");
                    String modelToRemove = sc.nextLine();
                    shop.removeComputer(modelToRemove);
                    break;
                case 3:
                    System.out.print("Введите модель для поиска: ");
                    String modelToFind = sc.nextLine();
                    Computer found = shop.findComputer(modelToFind);
                    if (found != null) {
                        System.out.println("Найден: " + found);
                    } else {
                        System.out.println("Компьютер не найден.");
                    }
                    break;
                case 4:
                    shop.printComputers();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    running = false;
                    break;
            }
        }
    }
}
