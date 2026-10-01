package practice4.practice4_1.task10;

public class Ship extends Vehicle {
    public Ship() {
        super("Корабль", 40);
    }

    @Override
    public double getPassengerCost(double distance, int passengers) {
        return passengers * distance * 3;
    }

    @Override
    public double getCargoCost(double distance, double tons) {
        return tons * distance * 1.5;
    }
}
