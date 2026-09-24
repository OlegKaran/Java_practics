package practice1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task3();
        task4(sc);
        task5(args);
        task6();
        int test1 = 5;
        int test2 = 20;
        int test3 = -3;
        System.out.printf("Факториал числа %d = %d%n", test1, calc_fact(test1));
        System.out.printf("Факториал числа %d = %d%n", test2, calc_fact(test2));
        System.out.printf("Факториал числа %d = %d%n", test3, calc_fact(test3));
    }

    public static void task3() {
        System.out.println("Задание 3:");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        float summa = 0;
        for (int num : arr) {
            summa += num;
        }
        System.out.println("Сумма элементов: " + summa);
        System.out.println("Среднее: " + summa / arr.length);
    }

    public static void task4(Scanner sc) {
        System.out.println("Задание 4:");
        System.out.println("Введите длину массива: ");
        int arr_len = sc.nextInt();
        int [] arr = new int[arr_len];
        int i = 0;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int s1 = 0;
        while (i < arr.length) {
            System.out.println("Введите число: ");
            arr[i] = sc.nextInt();
            s1 += arr[i];
            if (arr[i] > max1) max1 = arr[i];
            if (arr[i] < min1) min1 = arr[i];
            i++;
        }
        System.out.println("Сумма элементов: " + s1);
        System.out.println("Максимум в массиве: " + max1);
        System.out.println("Минимум в массиве: " + min1);
        int s2 = 0;
        int k = 0;
        int max2 = arr[0];
        int min2 = arr[0];
        do {
            s2 += arr[k];
            if (arr[k] > max2) max2 = arr[k];
            if (arr[k] < min2) min2 = arr[k];
            k ++;
        } while(k < arr.length);
        System.out.println("Сумма элементов: " + s2);
        System.out.println("Максимум в массиве: " + max2);
        System.out.println("Минимум в массиве: " + min2);
    }

    public static void task5(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
    }

    public static void task6() {
        System.out.println("Задание 6:");
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double num = 1.0 / i;
            System.out.printf("H(%d) = 1/%d = %.3f%n", i, i, num);
        }
    }

    public static long calc_fact(int n) {
        System.out.println("Задание 7:");
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}

