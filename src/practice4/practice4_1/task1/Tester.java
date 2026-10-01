package practice4.practice4_1.task1;

public class Tester {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 15),
                new Square(20),
        };

        for (Shape s : shapes) {
            System.out.println(s + "\n" +
                    "С площадью: " + s.getArea() + "\n" +
                    "С периметром: " + s.getPerimeter());
        }
    }
}
