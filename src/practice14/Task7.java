package practice14;

import java.util.regex.Pattern;

public class Task7 {
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

    private static final Pattern PATTERN = Pattern.compile(PASSWORD_REGEX);

    public static boolean isStrongPassword(String password) {
        return PATTERN.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };

        for (String password : passwords) {
            System.out.println(password + " -> " + isStrongPassword(password));
        }
    }
}
