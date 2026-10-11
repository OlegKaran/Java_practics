package practice13.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        StringBuilder result = getLine(words);
        System.out.println("Результат: " + result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }

        String[] currentChain = new String[words.length];
        boolean[] used = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            currentChain[0] = words[i];
            used[i] = true;

            if (buildChain(words, currentChain, used, 1)) {
                StringBuilder result = new StringBuilder();
                for (int j = 0; j < currentChain.length; j++) {
                    result.append(currentChain[j]);
                    if (j < currentChain.length - 1) {
                        result.append(" ");
                    }
                }
                return result;
            }

            used[i] = false;
        }

        return new StringBuilder();
    }

    private static boolean buildChain(String[] words, String[] chain, boolean[] used, int depth) {
        if (depth == words.length) {
            return true;
        }

        String lastWord = chain[depth - 1];
        char lastChar = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));

        for (int i = 0; i < words.length; i++) {
            if (!used[i]) {
                String nextWord = words[i];
                char firstChar = Character.toLowerCase(nextWord.charAt(0));

                if (lastChar == firstChar) {
                    chain[depth] = nextWord;
                    used[i] = true;

                    if (buildChain(words, chain, used, depth + 1)) {
                        return true;
                    }

                    used[i] = false;
                }
            }
        }

        return false;
    }
}

