package practice3.math_random_practice.task4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите размер массива: ");
            n = sc.nextInt();
        } while (n <= 0);
        Random rand = new Random();
        int[] nums = new int[n];
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(n);
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        int[] even_nums = new int[evenCount];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even_nums[k] = nums[i];
                k++;
            }
        }
        if (evenCount == 0) {
            System.out.println("В массиве нет четных элементов");
        }
        else {
            System.out.println("Четные элементы массива: " + Arrays.toString(even_nums));
        }
    }
}
