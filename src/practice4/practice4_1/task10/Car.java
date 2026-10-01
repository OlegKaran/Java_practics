package practice4.practice4_1.task10;

public class Car extends Vehicle {
    public Car() {
        super("Автомобиль", 90);
    }

    @Override
    public double getPassengerCost(double distance, int passengers) {
        return passengers * distance * 3;
    }

    @Override
    public double getCargoCost(double distance, double tons) {
        return tons * distance * 15;
    }
}