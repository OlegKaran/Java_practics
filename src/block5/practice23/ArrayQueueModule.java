package block5.practice23;

import java.util.NoSuchElementException;
import java.util.Objects;

/*
 * Инвариант: n >= 0, все a[i] != null.
 */
public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int head = 0;
    private static int size = 0;

    // Пред: element != null
    // Пост: n' = n + 1, a'[n'] = element, a'[i] = a[i] для i = 1..n
    public static void enqueue(Object element) {
        Objects.requireNonNull(element);
        ensureCapacity();
        elements[(head + size) % elements.length] = element;
        size++;
    }

    // Пред: n > 0
    // Пост: результат = a[1], очередь не изменилась
    public static Object element() {
        if (size == 0) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return elements[head];
    }

    // Пред: n > 0
    // Пост: результат = a[1], n' = n - 1, a'[i] = a[i + 1] для i = 1..n'
    public static Object dequeue() {
        Object result = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    // Пред: true
    // Пост: результат = n, очередь не изменилась
    public static int size() {
        return size;
    }

    // Пред: true
    // Пост: результат = (n == 0), очередь не изменилась
    public static boolean isEmpty() {
        return size == 0;
    }

    // Пред: true
    // Пост: n' = 0
    public static void clear() {
        elements = new Object[10];
        head = 0;
        size = 0;
    }

    private static void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}