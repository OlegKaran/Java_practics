package practice4.practice4_1.task3;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Иван Иванов", 20);

        p1.move();
        p1.talk();
        p2.move();
        p2.talk();
    }
}