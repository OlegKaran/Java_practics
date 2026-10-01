package practice6.task6_9;

public class Book implements Printable {
    private String author;
    private String name;
    public Book() {};
    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Вы взяли книгу");
    }
}
