package practice21;

import java.util.Arrays;

public class ArrayStorage <T> {
    private Object[] arr;
    private int size;

    public ArrayStorage() {
        arr = new Object[10];
        size = 0;
    }

    public void add(T e) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size] = e;
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Размер массива: " + size + ", Индекс: " + index);
        }
        return (T)arr[index];
    }

    public int size() {
        return size;
    }
}
