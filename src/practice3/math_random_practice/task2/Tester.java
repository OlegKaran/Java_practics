package practice3.math_random_practice.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {
    private Circle[] circles;
    private int count = 0;

    public Tester(int size) {
        circles = new Circle[size];
    }

    public void add(Circle c) {
        if (count < circles.length) {
            circles[count] = c;
            count++;
        } else {
            System.out.println("Массив заполнен");
        }
    }

    public void printAll() {
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }

    public Circle findMin() {
        if (count == 0) {
            return null;
        }
        Circle min_c = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getR() < min_c.getR()) {
                min_c = circles[i];
            }
        }
        return min_c;
    }

    public Circle findMax() {
        if (count == 0) {
            return null;
        }
        Circle max_c = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getR() > max_c.getR()) {
                max_c = circles[i];
            }
        }
        return max_c;
    }

    public void sort() {
        Arrays.sort(circles,
                0,
                count,
                Comparator.comparingDouble(Circle::getR)
        );
    }

    public static void main(String[] args) {
        Tester t = new Tester(3);
        t.add(new Circle(new Point(3, 4)));
        t.add(new Circle(new Point(1, 1)));
        t.add(new Circle(new Point(0, -1)));
        System.out.println("Самый маленький круг: " + t.findMin());
        System.out.println("Самый большой круг: " + t.findMax());
        System.out.println("Массив кругов до сортировки: ");
        t.printAll();
        System.out.println("Массив кругов после сортировки: ");
        t.sort();
        t.printAll();
    }
}
