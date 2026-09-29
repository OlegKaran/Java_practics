package practice3.math_random_practice.task3;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(arr));

        boolean is_grow = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i-1]) {
                is_grow = false;
                System.out.println("Массив не строго возрастающая последовательность");
                break;
            }
        }
        if (is_grow) {
            System.out.println("Массив строго возрастающая последовательность");
        }
    }
}
