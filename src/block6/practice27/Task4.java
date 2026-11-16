package block6.practice27;
import java.util.PriorityQueue;

public class Task4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(50);
        queue.add(20);
        queue.add(80);
        queue.add(10);
        queue.add(40);
        queue.add(90);
        queue.add(30);
        queue.add(70);
        queue.add(60);
        queue.add(100);

        System.out.println("Очередь создана. Размер: " + queue.size());
        System.out.println("Внутреннее содержимое: " + queue);

        System.out.println("\nИзвлекаем несколько элементов:");
        for (int i = 0; i < 3; i++) {
            Integer extracted = queue.poll();
            System.out.println("Извлечен элемент с приоритетом: " + extracted);
        }

        System.out.println("Размер очереди после извлечения: " + queue.size());
    }
}