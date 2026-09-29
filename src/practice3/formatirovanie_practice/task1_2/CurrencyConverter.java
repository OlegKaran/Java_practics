package practice3.formatirovanie_practice.task1_2;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    public static String[] CODES = {"RUB", "USD", "EUR", "CNY"};
    public static String[] NAMES = {"Российский рубль", "Доллар США", "Евро", "Китайский юань"};
    private static double[] RATES = {1.0, 90.0, 98.0, 12.5};
    private static final Locale[] LOCALES = {
            Locale.forLanguageTag("ru-RU"), Locale.US, Locale.FRANCE, Locale.CHINA
    };

    private static int indexOf(String code) {
        for (int i = 0; i < CODES.length; i++) {
            if (CODES[i].equalsIgnoreCase(code)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Неизвестная валюта: " + code);
    }

    public static void setRate(String code, double rateInRub) {
        if (rateInRub <= 0) {
            throw new IllegalArgumentException("Курс должен быть положительным");
        }
        RATES[indexOf(code)] = rateInRub;
    }

    public static double getRate(String code) {
        return RATES[indexOf(code)];
    }

    public static double convert(double amount, String from, String to) {
        double rub = amount * RATES[indexOf(from)];
        return rub / RATES[indexOf(to)];
    }

    public static String format(double amount, String code) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALES[indexOf(code)]);
        return nf.format(amount);
    }

    public static void printRates() {
        System.out.printf("%-4s %-20s %12s%n", "Код", "Валюта", "Курс, руб.");
        for (int i = 0; i < CODES.length; i++) {
            System.out.printf("%-4s %-20s %12.2f%n", CODES[i], NAMES[i], RATES[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Текущие курсы валют:");
        printRates();
        System.out.println();

        double amount = 1000;
        System.out.printf("Перевод %.2f RUB в другие валюты:%n", amount);
        for (String code : CODES) {
            double result = convert(amount, "RUB", code);
            System.out.printf("  %1$-3s -> %2$10.2f  (%3$s)%n", code, result, format(result, code));
        }
        System.out.println();

        System.out.printf("100 USD = %.2f EUR%n", convert(100, "USD", "EUR"));
        System.out.printf("50 EUR  = %.2f CNY%n", convert(50, "EUR", "CNY"));
    }

}