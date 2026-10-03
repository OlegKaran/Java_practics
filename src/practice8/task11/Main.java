package practice8.task11;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int countOnes() {
        int a = sc.nextInt();
        if (a == 0) {
            int b = sc.nextInt();
            if (b == 0) {
                return 0;
            }
            return (b == 1 ? 1 : 0) + countOnes();
        }
        return (a == 1 ? 1 : 0) + countOnes();
    }

    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}
