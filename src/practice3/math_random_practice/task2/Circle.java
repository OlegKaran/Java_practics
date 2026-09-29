package practice3.math_random_practice.task2;

public class Circle {
    private Point p;
    private double r = Math.random() * 100;
    private double len = 2 * Math.PI * r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLen() {
        return len;
    }

    public String toString() {
        return "Окружность:" + "\n" +
                "Центр в точке: " + p + "\n" +
                "Радиус = " + r;
    }
}
