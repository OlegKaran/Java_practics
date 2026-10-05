package practice7.task5_6;

public class Tester {
    public static void main(String[] args) {
        String s = "abcabadf";
        ProcessStrings process = new ProcessStrings();
        System.out.println("Длина вашей строки: " + process.getLength(s));
        System.out.println("Символы на нечетных позициях: " + process.getOddIndexedCharacters(s));
        System.out.println("Перевернутая строка: " + process.reverseString(s));
    }
}
