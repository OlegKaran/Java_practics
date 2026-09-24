package practice2.task2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner sc = new Scanner(System.in);
        Ball ball1 = new Ball(6.7, 7.9);
        System.out.println("x1: " + ball1.getX());
        System.out.println("y1: " + ball1.getY());
        Ball ball2 = new Ball();
        System.out.println("x2: " + ball2.getX());
        System.out.println("y2: " + ball2.getY());
        System.out.println("Введите x: ");
        x = sc.nextInt();
        System.out.println("Введите y: ");
        y = sc.nextInt();
        ball2.setX(x);
        ball2.setY(y);
        ball1.move(x, y);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
