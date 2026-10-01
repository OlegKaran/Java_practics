package practice6.task11;

public class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temp) {
        return temp + 273;
    }
}
