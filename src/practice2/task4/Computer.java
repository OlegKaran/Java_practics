package practice2.task4;

import java.util.Scanner;

public class Computer implements Inputable {
    private String model;
    private int ram;
    private double price;

    public Computer() {
    }

    public Computer(String model, int ram, double price) {
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Введите модель: ");
        this.model = scanner.nextLine();

        System.out.print("Введите объем RAM (ГБ): ");
        this.ram = scanner.nextInt();

        System.out.print("Введите цену: ");
        this.price = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", RAM: " + ram + " ГБ, Цена: " + price + " руб.";
    }
}

