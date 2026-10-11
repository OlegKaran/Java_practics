package practice11.task3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private Date birthDate;
    private int iDNumber;
    private double gpa;

    public Student(String name, Date birthDate, int iDNumber, double gpa) {
        this.name = name;
        this.birthDate = birthDate;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String format) {
        String pattern;
        switch (format.toLowerCase()) {
            case "short":
                pattern = "dd.MM.yy";
                break;
            case "medium":
                pattern = "dd MMM yyyy";
                break;
            case "full":
                pattern = "EEEE, d MMMM yyyy";
                break;
            default:
                pattern = format;
                break;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(birthDate);
    }
    public String toString() {
        return "Номер: " + iDNumber + "\n" +
                "Имя: " + name + "\n" +
                "Средний балл: " + gpa + "\n" +
                "Дата рождения: " + getFormattedBirthDate("short");
    }
}
