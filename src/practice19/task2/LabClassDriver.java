package practice19.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] initialStudents = new Student[]{
                new Student("Иванов Иван", 4.5),
                new Student("Петров Петр", 3.8),
                new Student("Сидоров Сидор", 4.9),
                new Student("Кузнецова Анна", 4.2)
        };

        LabClassInterface labClass = new LabClass(initialStudents);
        LabClassUI ui = new LabClassUI(labClass);
        ui.start();
    }
}
