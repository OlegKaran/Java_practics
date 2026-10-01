package practice4.practice4_1.task10;

public class Tester {
    public static void main(String[] args) {
        double distance = 1000;
        int passengers = 200;
        double tons = 50;

        Vehicle[] vehicles = {
                new Car(),
                new Airplane(),
                new Train(),
                new Ship()
        };
        System.out.printf("Расстояние: %.0f км, пассажиров: %d, груз: %.0f т%n%n",
                distance, passengers, tons);

        for (Vehicle v : vehicles) {
            System.out.println(v.getName() + "\n");
            System.out.printf("Время в пути: %.1f ч%n", v.getTime(distance));
            System.out.printf("Стоимость перевозки пассажиров: %.2f руб.%n",
                    v.getPassengerCost(distance, passengers));
            System.out.printf("Стоимость перевозки груза: %.2f руб.%n%n",
                    v.getCargoCost(distance, tons));
        }
    }
}
