package practice2.task3;

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
    public static void main(String[] args) {
        Tester t = new Tester(2);
        t.add(new Circle(new Point(5, 10), 60));
        t.add(new Circle(new Point(-9, 3), 10));
        t.add(new Circle(new Point(1, -8), 20));
        t.printAll();
    }
}
