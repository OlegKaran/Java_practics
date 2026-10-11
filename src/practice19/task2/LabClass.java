package practice19.task2;

import java.util.Arrays;

public class LabClass implements LabClassInterface {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    @Override
    public Student[] getStudents() {
        return students;
    }

    @Override
    public void sortByGPA() {
        Arrays.sort(students, new SortingStudentsByGPA());
    }

    @Override
    public Student findByName(String name) throws StudentNotFoundException, EmptyStringException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("ФИО для поиска не может быть пустым");
        }

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name.trim())) {
                return student;
            }
        }

        throw new StudentNotFoundException("Студент с ФИО \"" + name + "\" не найден");
    }
}
