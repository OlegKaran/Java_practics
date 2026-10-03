package practice9;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void InsertionSort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low >= high) {
            return;
        }

        Student pivot = arr[(low + high) / 2];
        int i = low;
        int j = high;

        while (i <= j) {
            while (comp.compare(arr[i], pivot) < 0) {
                i++;
            }
            while (comp.compare(arr[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, low, j, comp);
        quickSort(arr, i, high, comp);
    }

    public static Student[] mergeSort(Student[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        Student[] left = Arrays.copyOfRange(arr, 0, mid);
        Student[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static Student[] merge(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) {
                result[k] = a[i];
                i++;
            }
            else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            result[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }
}
