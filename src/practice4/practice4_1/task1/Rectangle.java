package practice4.practice4_1.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: a = " + width + ", b = " + height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }
}