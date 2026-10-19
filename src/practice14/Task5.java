package practice14;

import java.util.regex.Pattern;

public class Task5 {
    private static final String DATE_REGEX =
            "^(?:(?:31/(?:0[13578]|1[02])|(?:29|30)/(?:0[13-9]|1[0-2]))/(?:19\\d{2}|[2-9]\\d{3})" +
                    "|29/02/(?:19(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[3579][26])00|[2-9]\\d(?:0[48]|[2468][048]|[13579][26]))" +
                    "|(?:0[1-9]|1\\d|2[0-8])/(?:0[1-9]|1[0-2])/(?:19\\d{2}|[2-9]\\d{3}))$";

    private static final Pattern PATTERN = Pattern.compile(DATE_REGEX);

    public static boolean isValidDate(String date) {
        return PATTERN.matcher(date).matches();
    }

    public static void main(String[] args) {
        String[] dates = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899"
        };

        for (String date : dates) {
            System.out.println(date + " -> " + isValidDate(date));
        }
    }
}
