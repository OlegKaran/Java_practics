package practice8.task13;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void printOddPos() {
        int a = sc.nextInt();
        if (a == 0) {
            return;
        }
        System.out.println(a);
        int b = sc.nextInt();
        if (b == 0) {
            return;
        }
        printOddPos();
    }

    public static void main(String[] args) {
        printOddPos();
    }
}
