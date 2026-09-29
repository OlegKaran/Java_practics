package practice3.formatirovanie_practice.task1_2;

import java.util.Scanner;

public class OnlineShop {
    private static final String[] PRODUCTS = {
            "Ноутбук", "Смартфон", "Наушники", "Клавиатура", "Мышь"
    };
    private static final double[] PRICES = {
            75000.00, 42990.50, 5490.00, 3200.99, 1450.00
    };
    private static final Scanner sc = new Scanner(System.in);

    private static void printCatalog() {
        System.out.println("\n КАТАЛОГ:");
        System.out.printf("%-3s %-15s %15s%n", "№", "Товар", "Цена");
        for (int i = 0; i < PRODUCTS.length; i++) {
            System.out.printf("%-3d %-15s %15s%n",
                    i + 1, PRODUCTS[i], CurrencyConverter.format(PRICES[i], "RUB"));
        }
    }

    private static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            } else {
                sc.next();
            }
            System.out.printf("Ошибка! Введите число от %d до %d.%n", min, max);
        }
    }

    public static void main(String[] args) {
        int[] cart = new int[PRODUCTS.length];
        boolean empty = true;

        printCatalog();
        while (true) {
            int choice = readInt("Номер товара (0 - перейти к оплате): ", 0, PRODUCTS.length);
            if (choice == 0) {
                if (empty) {
                    System.out.println("Корзина пуста, выберите хотя бы один товар.");
                    continue;
                }
                break;
            }
            int count = readInt("Количество: ", 1, 100);
            cart[choice - 1] += count;
            empty = false;
            System.out.printf("Добавлено: %s x %d%n", PRODUCTS[choice - 1], count);
        }

        System.out.println("\nВыберите валюту оплаты:");
        for (int i = 0; i < CurrencyConverter.CODES.length; i++) {
            System.out.printf("%d - %s (%s)%n", i + 1,
                    CurrencyConverter.NAMES[i], CurrencyConverter.CODES[i]);
        }
        int cur = readInt("Ваш выбор: ", 1, CurrencyConverter.CODES.length);
        String code = CurrencyConverter.CODES[cur - 1];



        double total = 0;
        int line = 1;
        for (int i = 0; i < PRODUCTS.length; i++) {
            if (cart[i] == 0) continue;
            double price = CurrencyConverter.convert(PRICES[i], "RUB", code);
            double sum = price * cart[i];
            total += sum;
        }
        System.out.printf("Сумма к оплате: %.2f %s%n", total, code);
    }
}
