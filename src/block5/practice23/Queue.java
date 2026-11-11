package block5.practice23;

/*
 * Инвариант: n >= 0, все a[i] != null.
 */

public interface Queue {
    /*
     * Пред: element != null
     * Пост: n' = n + 1, a'[n'] = element, a'[i] = a[i] для i = 1..n
     */
    void enqueue(Object element);

    /*
     * Пред: n > 0
     * Пост: результат = a[1], очередь не изменилась
     */
    Object element();

    /*
     * Пред: n > 0
     * Пост: результат = a[1], n' = n - 1, a'[i] = a[i + 1] для i = 1..n'
     */
    Object dequeue();

    /*
     * Пред: true
     * Пост: результат = n, очередь не изменилась
     */
    int size();

    /*
     * Пред: true
     * Пост: результат = (n == 0), очередь не изменилась
     */
    boolean isEmpty();

    /*
     * Пред: true
     * Пост: n' = 0
     */
    void clear();
}
