package practice7.task7_8;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Гарри Поттер"),
                new Book("Властелин колец"),
                new Magazine("Наука"),
                new Magazine("AI in everyday life")
        };
        System.out.println(" === Только книги: ===");
        Book.printBooks(printables);
        System.out.println("=== Только журналы: ===");
        Magazine.printMagazines(printables);
    }
}
