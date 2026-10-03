package practice9;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Олег", 305, 4.2),
                new Student("Кирилл", 102, 4.8),
                new Student("Эдмон", 517, 3.9),
                new Student("Денис", 214, 4.5),
                new Student("Федя", 128, 3.6)
        };
        System.out.println("=== До сортировки: === ");
        for (Student s : students) {
            System.out.println(s);
        }

        Sorting.InsertionSort(students);
        System.out.println("\n=== После сортировки по номеру по возрастанию: ===");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\n=== После сортировки по баллам по убыванию: === ");
        Sorting.quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());
        for (Student s : students) {
            System.out.println(s);
        }

        Student[] students1 = {
                new Student("Эдмон", 102, 3.9),
                new Student("Денис", 463, 4.5),
                new Student("Федя", 432, 3.6)
        };

        System.out.println("\n\n=== Массив 1 до сортировки ===");
        for (Student s : students1) {
            System.out.println(s);
        }

        Student[] students2 = {
                new Student("Олег", 400, 4.2),
                new Student("Кирилл", 56, 4.8),
        };

        System.out.println("\n=== Массив 2 до сортировки ===");
        for (Student s : students2) {
            System.out.println(s);
        }

        Student[] s1_sorted = Sorting.mergeSort(students1);
        Student[] s2_sorted = Sorting.mergeSort(students2);
        Student[] sorted_s1s2 = Sorting.merge(s1_sorted, s2_sorted);

        System.out.println("\n===Массивы 1 и 2 после сортировки и слияния: ===");
        for (Student s : sorted_s1s2) {
            System.out.println(s);
        }
    }
}
