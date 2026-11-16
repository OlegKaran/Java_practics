package block6.practice28.task2;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public Map<String, String> createMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Иванов", "Алексей");
        hashMap.put("Петров", "Алексей");
        hashMap.put("Сидоров", "Иван");
        hashMap.put("Иванов", "Дмитрий");
        hashMap.put("Иванов", "Алексей");
        hashMap.put("Петров", "Алексей");
        hashMap.put("Сидоров", "Иван");
        hashMap.put("Смирнов", "Иван");
        hashMap.put("Кузнецов", "Петр");
        hashMap.put("Васильев", "Алексей");
        return hashMap;
    }

    public int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String firstName : map.values()) {
            nameCounts.put(firstName, nameCounts.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int countName : nameCounts.values()) {
            if (countName > 1) {
                count += countName;
            }
        }
        return count;
    }

    public int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastnameCounts = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastnameCounts.put(lastName, lastnameCounts.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int countName : lastnameCounts.values()) {
            if (countName > 1) {
                count += countName;
            }
        }
        return count;
    }
 }
