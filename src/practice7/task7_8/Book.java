package practice7.task7_8;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Книга: " + title);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                Book book = (Book) p;
                book.print();
            }
        }
    }
}
