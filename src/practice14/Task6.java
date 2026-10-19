package practice14;

import java.util.regex.Pattern;

public class Task6 {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@" +
                    "(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)*[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?$";

    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        return PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };

        for (String email : emails) {
            System.out.println(email + " -> " + isValidEmail(email));
        }
    }
}
