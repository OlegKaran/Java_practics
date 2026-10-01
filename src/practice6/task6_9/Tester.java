package practice6.task6_9;

public class Tester {
    public static void main(String[] args) {
        Printable[] test_arr = {
                new Book("Толстой", "Война и мир"),
                new Shop("SOTA AI models"),
                new Book(),
                new Shop()
        };

        for (Printable p : test_arr) {
            p.print();
        }
    }
}
