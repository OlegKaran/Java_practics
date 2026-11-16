package block6.practice28.task1;
import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Хамидуллин");
        hashset.add("Шапаренко");
        hashset.add("Карановский");

        System.out.println("Исходный hashset без сортировки: " + hashset);

        TreeSet<String> treeset = new TreeSet<>(hashset);
        System.out.println("Treeset с отсортированными данными: " + treeset);
    }
}
