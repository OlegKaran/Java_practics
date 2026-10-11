package practice13.task2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Person(String lastName) {
        this(lastName, null, null);
    }

    public String getFullName() {
        if (lastName == null || lastName.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(' ').append(firstName.charAt(0)).append('.');
        }

        if (middleName != null && !middleName.isEmpty()) {
            if (firstName == null || firstName.isEmpty()) {
                sb.append(' ');
            }
            sb.append(middleName.charAt(0)).append('.');
        }

        return sb.toString();
    }
}

