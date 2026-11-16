package block6.practice27;

public class HashTab {
    private static class Node {
        String key;
        String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int capacity;

    public int hashtabHash(String key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % capacity;
    }

    public HashTab(int size) {
         this.capacity = size;
         this.buckets = new Node[capacity];
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        Node newNode = new Node(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        }
        else {
            Node current = buckets[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }

                if (current.next == null) {
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
            }
            prev = current;
            current = current.next;
        }
    }
}
