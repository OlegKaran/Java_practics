package practice8.task15;

import java.util.Scanner;

public class Main {
    public static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n % 10);
        printReverse(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n);
    }
}
