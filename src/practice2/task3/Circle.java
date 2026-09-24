package practice2.task3;

public class Circle {
    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
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

    public String toString() {
        return "Окружность:" + "\n" +
                "Центр в точке: " + p + "\n" +
                "Радиус = " + r;
    }
}
