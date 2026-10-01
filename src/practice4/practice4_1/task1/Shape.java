package practice4.practice4_1.task1;

public abstract class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public abstract String getType();
    public abstract String toString();
    public abstract double getArea();
    public abstract double getPerimeter();
}
