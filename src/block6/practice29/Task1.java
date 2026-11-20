package block6.practice29;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    count += 1;
                }
            }
        }
        System.out.println("Количество дорог: " + count / 2);
        sc.close();
    }
}
