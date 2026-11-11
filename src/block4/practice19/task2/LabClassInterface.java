package block4.practice19.task2;

public interface LabClassInterface {
    void sortByGPA();
    Student findByName(String name) throws StudentNotFoundException;
    Student[] getStudents();
}
