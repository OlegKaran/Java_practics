package practice4.practice4_1.task1;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: r = " + radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }
}

