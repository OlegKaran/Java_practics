package practice13.task1;

public class Main {
    public static void stringsOperations(String s) {
        System.out.println("2. Последний символ строки: " + s.charAt(s.length() - 1));
        boolean endsWith = s.endsWith("!!!");
        if (endsWith) {
            System.out.println("3. Строка заканчивается подстрокой '!!!'");
        }
        else {
            System.out.println("3. Строка не заканчивается подстрокой '!!!'");
        }
        boolean startsWith = s.startsWith("I like");
        if (startsWith) {
            System.out.println("4. Строка начинается с подстроки 'I like'");
        }
        else {
            System.out.println("4. Строка не начинается с подстроки 'I like'");
        }
        boolean contain = s.contains("Java");
        if (contain) {
            System.out.println("5. Строка содержит подстроку 'Java'");
        }
        else {
            System.out.println("5. Строка не содержит подстроку 'Java'");
        }
        int javaIndex = s.indexOf("Java");
        System.out.println("6. Позиция строки 'Java': " + javaIndex);
        String replaced = s.replace("a", "o");
        System.out.println("7. Строка с заменой 'a' на 'o'" + replaced);
        System.out.println("8. В верхнем регистре: " + s.toUpperCase());
        System.out.println("9. В нижнем регистре: " + s.toLowerCase());
        if (javaIndex != -1) {
            String sub = s.substring(javaIndex, javaIndex + 4);
            System.out.println("10. Вырезанная подстрока 'Java': " + sub);
        }
        else {
            System.out.println("10. Подстроки Java нет");
        }
    }

    public static void main(String[] args) {
        String s = "I like Java";
        stringsOperations(s);
    }
}
