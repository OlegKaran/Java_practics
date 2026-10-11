package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static <T> List<T> arrayToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T e : arr) {
            list.add(e);
        }
        return list;
    }

    public static void printFirstFive(File path) {
        File[] files = path.listFiles();
        if (files == null) {
            System.out.println("Каталог не найден: " + path);
            return;
        }
        List<File> list = arrayToList(files);
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println((i + 1) + ": " + list.get(i).getName());
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = arrayToList(arr);
        System.out.println("Задание 1: " + list);

        ArrayStorage<String> arrst = new ArrayStorage<>();
        arrst.add("cat");
        arrst.add("dog");
        System.out.println("Задание 3: элемент с индексом 1 = " + arrst.get(1));

        File dir = new File("/Users/mac/Downloads");
        System.out.println("Задание 4:");
        printFirstFive(dir);
    }
}
