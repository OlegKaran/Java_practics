package practice19.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlinePurchase {
    private static final Map<String, String> database = new HashMap<>();
    static {
        database.put("Иванов Иван Иванович", "1234414311");
        database.put("Петров Петр Игоревич", "111122223333");
    }
    public static void validateInn(String fullname, String inn) throws InvalidInnException {
        if (inn == null || inn.matches("\\\\d{10}|\\\\d{12}")) {
            throw new InvalidInnException("Размер ИНН должен быть равен 10 или 12");
        }
        String validInn = database.get(fullname);
        if (validInn == null) {
            throw new InvalidInnException("Клиент с ФИО: " + fullname + " " + "не найден в базе данных");
        }
        if (!validInn.equals(inn)) {
            throw new InvalidInnException("ИНН" + inn + " не соответствует клиенту");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Введите номер ИНН: ");
        String inn = sc.nextLine().trim();

        try {
            validateInn(fullName, inn);
            System.out.println("Заказ успешно оформлен для клиента: " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }
}
