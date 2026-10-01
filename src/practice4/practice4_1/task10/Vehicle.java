package practice4.practice4_1.task10;

public abstract class Vehicle {
    protected String name;
    protected double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getTime(double distance) {
        return distance / speed;
    }

    public abstract double getPassengerCost(double distance, int passengers);

    public abstract double getCargoCost(double distance, double tons);
}