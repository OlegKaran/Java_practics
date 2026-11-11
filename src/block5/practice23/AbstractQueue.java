package block5.practice23;

import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public void enqueue(Object element) {
        Objects.requireNonNull(element);
        enqueueImpl(element);
        size++;
    }

    @Override
    public Object element() {
        if (size == 0) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return elementImpl();
    }

    @Override
    public Object dequeue() {
        Object result = element();
        dequeueImpl();
        size--;
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        clearImpl();
        size = 0;
    }

    protected abstract void enqueueImpl(Object element);

    protected abstract Object elementImpl();

    protected abstract void dequeueImpl();

    protected abstract void clearImpl();
}

