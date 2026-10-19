package practice10;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

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

    public static Student[] mergeSort(Student[] arr, Comparator<Student> comp) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        Student[] left = Arrays.copyOfRange(arr, 0, mid);
        Student[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left, comp), mergeSort(right, comp), comp);
    }

    public static Student[] merge(Student[] a, Student[] b, Comparator<Student> comp) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (comp.compare(a[i], b[j]) <= 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
}
