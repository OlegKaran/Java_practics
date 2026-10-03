package practice9;

public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
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

    public String toString() {
        return "Номер: " + iDNumber + "\n" +
                "Имя: " + name + "\n" +
                "Средний балл: " + gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.iDNumber - other.iDNumber;
    }
}
