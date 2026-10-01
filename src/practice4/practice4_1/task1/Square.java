package practice4.practice4_1.task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Квадрат");
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной: a = " + side;
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
