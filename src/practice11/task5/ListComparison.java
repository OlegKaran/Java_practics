package practice11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    private static final int ELEMENTS_COUNT = 100_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.printf("%-30s | %-15s | %-15s%n", "Операция", "ArrayList (мс)", "LinkedList (мс)");

        long start = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        long timeArrayListAdd = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i);
        }
        long timeLinkedListAdd = (System.nanoTime() - start) / 1_000_000;
        printRow("Добавление в конец", timeArrayListAdd, timeLinkedListAdd);

        int insertCount = 10_000;
        start = System.nanoTime();
        for (int i = 0; i < insertCount; i++) {
            arrayList.add(0, -1);
        }
        long timeArrayListInsert = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        for (int i = 0; i < insertCount; i++) {
            linkedList.add(0, -1);
        }
        long timeLinkedListInsert = (System.nanoTime() - start) / 1_000_000;
        printRow("Вставка в начало (10k)", timeArrayListInsert, timeLinkedListInsert);

        int target = ELEMENTS_COUNT / 2;
        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            arrayList.indexOf(target);
        }
        long timeArrayListSearch = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            linkedList.indexOf(target);
        }
        long timeLinkedListSearch = (System.nanoTime() - start) / 1_000_000;
        printRow("Поиск по значению (500 раз)", timeArrayListSearch, timeLinkedListSearch);

        start = System.nanoTime();
        for (int i = 0; i < 5_000; i++) {
            arrayList.get(ELEMENTS_COUNT / 2);
        }
        long timeArrayListGet = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        for (int i = 0; i < 5_000; i++) {
            linkedList.get(ELEMENTS_COUNT / 2);
        }
        long timeLinkedListGet = (System.nanoTime() - start) / 1_000_000;
        printRow("Доступ по индексу get(5k)", timeArrayListGet, timeLinkedListGet);

        int removeCount = 10_000;
        start = System.nanoTime();
        for (int i = 0; i < removeCount; i++) {
            arrayList.remove(0);
        }
        long timeArrayListRemove = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        for (int i = 0; i < removeCount; i++) {
            linkedList.remove(0);
        }
        long timeLinkedListRemove = (System.nanoTime() - start) / 1_000_000;
        printRow("Удаление из начала (10k)", timeArrayListRemove, timeLinkedListRemove);
    }

    private static void printRow(String op, long alTime, long llTime) {
        System.out.printf("%-30s | %-15d | %-15d%n", op, alTime, llTime);
    }
}
