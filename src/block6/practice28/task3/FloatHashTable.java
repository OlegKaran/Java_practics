package block6.practice28.task3;

public class FloatHashTable {
    private static class Node {
        float key;
        String value;
        Node next;

        Node(float key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int capacity;

    public FloatHashTable(int size) {
        this.capacity = size;
        this.buckets = new Node[capacity];
    }

    public int hashtabHash(float key) {
        int bits = Float.floatToIntBits(key);
        bits ^= (bits >>> 16);
        return Math.abs(bits) % capacity;
    }

    public void hashtabAdd(float key, String value) {
        int index = hashtabHash(key);
        Node newNode = new Node(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        }
        else {
            Node current = buckets[index];
            while (current != null) {
                if (Float.compare(current.key, key) == 0) {
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

    public String hashtabLookup(float key) {
        int index = hashtabHash(key);
        Node current = buckets[index];

        while (current != null) {
            if (Float.compare(current.key, key) == 0) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void hashtabDelete(float key) {
        int index = hashtabHash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (Float.compare(current.key, key) == 0) {
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
