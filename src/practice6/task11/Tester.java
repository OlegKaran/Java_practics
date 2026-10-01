package practice6.task11;

public class Tester {
    public static void main(String[] args) {
        Convertable CelToKel = new CelsiusToKelvinConverter();
        Convertable CelToFahr = new CelsiusToFahrenheitConverter();
        double temp = 27.50;
        System.out.println("Температура по Цельсию: " + temp + "\n" +
                "Температура по Кельвину: " + CelToKel.convert(temp));
        System.out.println("Температура по Цельсию: " + temp + "\n" +
                "Температура по Фаренгейту: " + CelToFahr.convert(temp));
    }
}
