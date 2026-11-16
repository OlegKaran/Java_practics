package block6.practice28.task2;

import java.util.Map;

public class HashMapTester {
    public static void main(String[] args) {
        Task2 task = new Task2();
        Map<String, String> map = task.createMap();
        System.out.println("Количество людей с одинаковыми именами: " + task.getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковыми фамилиями: " + task.getSameLastNameCount(map));
    }
}
