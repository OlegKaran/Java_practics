package practice4.practice4_1.task10;

public class Airplane extends Vehicle {
    public Airplane() {
        super("Самолёт", 800);
    }

    @Override
    public double getPassengerCost(double distance, int passengers) {
        return passengers * (distance * 5 + 1500);
    }

    @Override
    public double getCargoCost(double distance, double tons) {
        return tons * distance * 40;
    }
}
