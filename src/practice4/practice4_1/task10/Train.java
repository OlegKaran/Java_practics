package practice4.practice4_1.task10;

public class Train extends Vehicle {
    public Train() {
        super("Поезд", 80);
    }

    @Override
    public double getPassengerCost(double distance, int passengers) {
        return passengers * distance * 2;
    }

    @Override
    public double getCargoCost(double distance, double tons) {
        return tons * distance * 3;
    }
}
