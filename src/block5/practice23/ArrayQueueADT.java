package block5.practice23;

import java.util.NoSuchElementException;
import java.util.Objects;

/*
 * Инвариант: n >= 0, все a[i] != null.
 */
public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int head = 0;
    private int size = 0;

    // Пред: element != null
    // Пост: n' = n + 1, a'[n'] = element, a'[i] = a[i] для i = 1..n
    public static void enqueue(ArrayQueueADT queue, Object element) {
        Objects.requireNonNull(element);
        ensureCapacity(queue);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }

    // Пред: n > 0
    // Пост: результат = a[1], очередь не изменилась
    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return queue.elements[queue.head];
    }

    // Пред: n > 0
    // Пост: результат = a[1], n' = n - 1, a'[i] = a[i + 1] для i = 1..n'
    public static Object dequeue(ArrayQueueADT queue) {
        Object result = element(queue);
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    // Пред: true
    // Пост: результат = n, очередь не изменилась
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Пред: true
    // Пост: результат = (n == 0), очередь не изменилась
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Пред: true
    // Пост: n' = 0
    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.head = 0;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.elements.length) {
            Object[] newElements = new Object[queue.elements.length * 2];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
        }
    }
}