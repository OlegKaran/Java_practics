package practice10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] iDNumber;

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    public void setArray(Student[] students) {
        this.iDNumber = students;
    }

    public Student[] getArray() {
        return this.iDNumber;
    }

    public void quicksort() {
        if (iDNumber != null && iDNumber.length > 0) {
            Sorting.quickSort(iDNumber, 0, iDNumber.length - 1, this);
        }
    }

    public void mergeSort() {
        if (iDNumber != null && iDNumber.length > 0) {
            iDNumber = Sorting.mergeSort(iDNumber, this);
        }
    }

    public void outArray() {
        if (iDNumber == null) return;
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    public void sortByField(Comparator<Student> customComparator) {
        if (iDNumber != null && iDNumber.length > 0) {
            Sorting.quickSort(iDNumber, 0, iDNumber.length - 1, customComparator);
        }
    }

    public static Student[] mergeAndSortTwoLists(Student[] list1, Student[] list2, Comparator<Student> comp) {
        Student[] sorted1 = Sorting.mergeSort(list1, comp);
        Student[] sorted2 = Sorting.mergeSort(list2, comp);
        return Sorting.merge(sorted1, sorted2, comp);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        Student[] initialStudents = {
                new Student("Олег", "Иванов", "ИВТ", 2, "ИКБО-01", 305, 4.2),
                new Student("Кирилл", "Петров", "ПИ", 1, "ИКБО-02", 102, 4.8),
                new Student("Эдмон", "Смирнов", "ПМИ", 3, "ИКБО-03", 517, 3.9),
                new Student("Денис", "Соколов", "ИВТ", 2, "ИКБО-01", 214, 4.5),
                new Student("Федя", "Шапаренко", "КБ", 4, "ИКБО-04", 128, 3.6)
        };

        sorter.setArray(initialStudents);
        System.out.println("=== Исходный массив (outArray): ===");
        sorter.outArray();

        sorter.quicksort();
        System.out.println("\n=== После быстрой сортировки (quicksort) по GPA по убыванию: ===");
        sorter.outArray();

        sorter.sortByField(Comparator.comparing(Student::getSurname));
        System.out.println("\n=== После сортировки по другому полю (по Фамилии): ===");
        sorter.outArray();

        sorter.sortByField(Comparator.comparingInt(Student::getCourse));
        System.out.println("\n=== После сортировки по другому полю (по Курсу): ===");
        sorter.outArray();

        sorter.mergeSort();
        System.out.println("\n=== После сортировки слиянием (mergeSort) по GPA по убыванию: ===");
        sorter.outArray();

        Student[] list1 = {
                new Student("Эдмон", "Смирнов", "ПМИ", 3, "ИКБО-03", 102, 3.9),
                new Student("Денис", "Соколов", "ИВТ", 2, "ИКБО-01", 463, 4.5),
                new Student("Федя", "Шапаренко", "КБ", 4, "ИКБО-04", 432, 3.6)
        };

        Student[] list2 = {
                new Student("Олег", "Карановский", "ИВТ", 2, "ИКБО-01", 400, 4.2),
                new Student("Кирилл", "Петров", "ПИ", 1, "ИКБО-02", 56, 4.8)
        };

        Student[] mergedList = mergeAndSortTwoLists(list1, list2, sorter);
        sorter.setArray(mergedList);

        System.out.println("\n=== Задание 3: Объединенный и отсортированный список из двух массивов: ===");
        sorter.outArray();
    }
}
