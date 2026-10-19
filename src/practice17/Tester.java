package practice17;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип списка:");
        System.out.println("1 - Односвязный список (Задание 1)");
        System.out.println("2 - Двусвязный список (Задание 2)");
        System.out.println("3 - Кольцевой список (Задание 2)");
        System.out.print("Ваш выбор: ");

        int listType = scanner.nextInt();
        scanner.nextLine();

        SinglyLinkedList singlyList = new SinglyLinkedList();
        DoublyLinkedList doublyList = new DoublyLinkedList();
        CircularLinkedList circularList = new CircularLinkedList();

        while (true) {
            System.out.println("\n=== МЕНЮ КАРТОТЕКИ ===");
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить элемент");
            System.out.println("3. Удалить элемент по имени");
            System.out.println("4. Вывести список на экран");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить список на пустоту");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    if (listType == 1) singlyList.createEmptyList();
                    else if (listType == 2) doublyList.createEmptyList();
                    else circularList.createEmptyList();
                    System.out.println("Пустой список создан.");
                    break;
                case 2:
                    if (listType == 1) singlyList.addNode(scanner);
                    else if (listType == 2) doublyList.addNode(scanner);
                    else circularList.addNode(scanner);
                    System.out.println("Элемент добавлен.");
                    break;
                case 3:
                    System.out.print("Введите имя для удаления: ");
                    String name = scanner.nextLine();
                    boolean removed;
                    if (listType == 1) removed = singlyList.removeNode(name);
                    else if (listType == 2) removed = doublyList.removeNode(name);
                    else removed = circularList.removeNode(name);
                    System.out.println(removed ? "Элемент удален." : "Элемент не найден.");
                    break;
                case 4:
                    if (listType == 1) singlyList.displayList();
                    else if (listType == 2) doublyList.displayList();
                    else circularList.displayList();
                    break;
                case 5:
                    if (listType == 1) singlyList.clear();
                    else if (listType == 2) doublyList.clear();
                    else circularList.clear();
                    System.out.println("Список очищен.");
                    break;
                case 6:
                    boolean empty;
                    if (listType == 1) empty = singlyList.isEmpty();
                    else if (listType == 2) empty = doublyList.isEmpty();
                    else empty = circularList.isEmpty();
                    System.out.println(empty ? "Список пуст." : "В списке есть элементы.");
                    break;
                default:
                    System.out.println("Неверный пункт меню.");
            }
        }
    }
}
