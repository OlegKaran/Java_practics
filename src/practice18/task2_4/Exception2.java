package practice18.task2_4;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
            System.out.println("Финальный блок выполнен");
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
    // Qwerty - NumberFormatException
    // 0 - ArithmeticException
    // 1.2, 1. - NumberFormatException
}

