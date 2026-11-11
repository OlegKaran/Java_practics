package block5.practice23;

/*
 * Представление: элементы хранятся в elements начиная с индекса head,
 * по кругу: a[i] = elements[(head + i - 1) % elements.length].
 * Инвариант представления: 0 <= head < elements.length, size <= elements.length.
 */
public class ArrayQueue extends AbstractQueue {
    private Object[] elements = new Object[10];
    private int head = 0;

    @Override
    protected void enqueueImpl(Object element) {
        ensureCapacity();
        elements[(head + size) % elements.length] = element;
    }

    @Override
    protected Object elementImpl() {
        return elements[head];
    }

    @Override
    protected void dequeueImpl() {
        elements[head] = null;
        head = (head + 1) % elements.length;
    }

    @Override
    protected void clearImpl() {
        elements = new Object[10];
        head = 0;
    }

    private void ensureCapacity() {
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