package practice20.task1_3;

public class Tester {
    public static void main(String[] args) {
        GenericBox<Integer, Dog, String> box = new GenericBox<>(
                56, new Dog("Шарик", 5), "classes"
        );

        System.out.println("T: " + box.getContentT());
        System.out.println("V: " + box.getContentV());
        System.out.println("K: " + box.getContentK());
        System.out.println();
        box.printClasses();
    }
}
