package practice2.task4;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int capacity) {
        this.computers = new Computer[capacity];
        this.count = 0;
    }

    public void addComputer(Computer computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;
            System.out.println("Компьютер добавлен.");
        } else {
            System.out.println("Магазин заполнен, больше добавить нельзя.");
        }
    }

    public void removeComputer(String model) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                computers[i] = computers[i + 1];
            }
            computers[count - 1] = null;
            count--;
            System.out.println("Компьютер '" + model + "' успешно удален.");
        } else {
            System.out.println("Компьютер с такой моделью не найден.");
        }
    }

    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }
        return null;
    }

    public void printComputers() {
        if (count == 0) {
            System.out.println("В магазине нет компьютеров.");
            return;
        }
        System.out.println("Список компьютеров в магазине:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}

