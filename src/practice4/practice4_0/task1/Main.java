package practice4.practice4_0.task1;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
        for (Season sn : Season.values()) {
            System.out.println(sn + ": " + "Средняя температура: " + sn.getMeanTemp() + ", " + sn.getDescription());
        }
    }
}
