package practice2.task9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        final int CARDS_PER_PLAYER = 5;
        String[] suits = {"Пик", "Треф", "Бубен", "Черв"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int totalCards = suits.length * ranks.length;
        String[] deck = new String[totalCards];
        int index = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[index] = ranks[i] + " " + suits[j];
                index = index + 1;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");

        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Число игроков должно быть больше 0.");
            return;
        } else if (n * CARDS_PER_PLAYER > totalCards) {
            System.out.println("Слишком много игроков! В колоде всего 52 карты (максимум "
                    + (totalCards / CARDS_PER_PLAYER) + " игроков).");
            return;
        }

        for (int i = 0; i < totalCards; i++) {
            int randomIndex = i + (int) (Math.random() * (totalCards - i));
            String temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }

        int cardCounter = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < CARDS_PER_PLAYER; j++) {
                System.out.println(deck[cardCounter++]);
            }
            System.out.println();
        }
    }
}

