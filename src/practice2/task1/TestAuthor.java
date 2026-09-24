package practice2.task1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String email;
        Scanner sc = new Scanner(System.in);
        Author ar = new Author("Никита", "nikita@mail.ru", 'm');
        System.out.println("Имя Автора: " + ar.getName());
        System.out.println("Email Автора: " + ar.getEmail());
        System.out.println("Пол автора: " + ar.getGender());
        System.out.println("Введите новый email: ");
        email = sc.next();
        ar.setEmail(email);
        System.out.println("Новый Email Автора: " + ar.getEmail());
        System.out.println(ar);
    }
}
