package practice7.task7_8;

public class Magazine implements Printable{
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                Magazine mag = (Magazine) p;
                p.print();
            }
        }
    }
}
