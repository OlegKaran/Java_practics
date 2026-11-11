package block5.practice23;

/*
 * Инвариант представления: size == 0 <=> head == null <=> tail == null,
 */
public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        private final Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    @Override
    protected void enqueueImpl(Object element) {
        Node node = new Node(element);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    @Override
    protected Object elementImpl() {
        return head.value;
    }

    @Override
    protected void dequeueImpl() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    @Override
    protected void clearImpl() {
        head = null;
        tail = null;
    }
}