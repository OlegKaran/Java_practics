package practice6.task11;

public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
}
