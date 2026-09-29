package practice3.obolochki_practice.task1;

public class Main {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(66.321);
        Double d2 = Double.valueOf("1234.2341");
        double parsedDouble = Double.parseDouble("1234.9584");
        System.out.println("Результат parseDouble: " + parsedDouble);
        byte b = d1.byteValue();
        System.out.println("d1 в byte: " + b);
        short s = d1.shortValue();
        System.out.println("d1 в short: " + s);
        int i = d1.intValue();
        System.out.println("d1 в int: " + i);
        long l = d1.longValue();
        System.out.println("d1 в long: " + l);
        float f = d1.floatValue();
        System.out.println("d1 в float: " + f);
        char c = (char) d1.intValue();
        System.out.println("d1 в char: " + c);
        boolean bool = d1 != 0.0;
        System.out.println("d1 в bool: " + bool);
        System.out.println("Значение d1: " + d1);
        System.out.println("Значение d2: " + d2);
        String dStr = Double.toString(3.14);
        System.out.println(dStr);
    }

}
