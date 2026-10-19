package practice10;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private int iDNumber;
    private double gpa;

    public Student(String name, String surname, String specialty, int course, String group, int iDNumber, double gpa) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public int getiDNumber() { return iDNumber; }
    public void setiDNumber(int iDNumber) { this.iDNumber = iDNumber; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return String.format("ID: %-4d | %-10s %-10s | Спец.: %-10s | Курс: %d | Группа: %-8s | Балл: %.1f",
                iDNumber, name, surname, specialty, course, group, gpa);
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }
}
