package practice13.task5;

public class PhoneNumber {
    private String formattedNumber;

    public PhoneNumber(String phone) {
        String countryCode;
        String number;

        if (phone.startsWith("+")) {
            countryCode = phone.substring(1, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else if (phone.startsWith("8")) {
            countryCode = "7";
            number = phone.substring(1);
        } else {
            formattedNumber = "Неверный формат";
            return;
        }

        String part1 = number.substring(0, 3);
        String part2 = number.substring(3, 6);
        String part3 = number.substring(6, 10);

        formattedNumber = "+" + countryCode + " " +  part1 + "-" + part2 + "-" + part3;
    }

    @Override
    public String toString() {
        return formattedNumber;
    }
}
