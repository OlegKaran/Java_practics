package practice9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}
