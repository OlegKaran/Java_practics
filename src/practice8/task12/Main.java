package practice8.task12;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void printOddNums() {
        int a = sc.nextInt();
        if (a == 0) {
            return;
        }
        if (a % 2 != 1) {
            System.out.println(a);
        }
        printOddNums();
    }
    public static void main(String[] args) {
        printOddNums();
    }
}
