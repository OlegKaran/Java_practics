package practice3.math_random_practice.task1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива 1: ");
        int size1 = sc.nextInt();
        double[] arr1  = new double[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random();
        }
        System.out.println("Массив с помощью класса Math без сортировки: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%.4f, ", arr1[i]);
        }
        System.out.println();
        Arrays.sort(arr1);
        System.out.println("Массив с помощью класса Math с сортировкой: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%.4f, ", arr1[i]);
        }
        System.out.println();
        System.out.println("Введите размер массива 2: ");
        int size2 = sc.nextInt();
        double[] arr2  = new double[size2];
        Random rand = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextDouble();
        }
        System.out.println("Массив с помощью класса Random без сортировки: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%.4f, ", arr2[i]);
        }
        System.out.println();
        Arrays.sort(arr2);
        System.out.println("Массив с помощью класса Random с сортировкой: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%.4f, ", arr2[i]);
        }
        System.out.println();
    }
}
