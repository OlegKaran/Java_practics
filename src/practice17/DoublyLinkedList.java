package practice17;

import java.util.Scanner;

public class DoublyLinkedList {
    private static class Node {
        Student data;
        Node prev;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        createEmptyList();
    }

    public void createEmptyList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNode(Scanner sc) {
        Student student = new Student();
        student.readFromConsole(sc);
        Node newNode = new Node(student);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public boolean removeNode(String name) {
        if (isEmpty()) {
            return false;
        }
        Node current = head;
        while (current != null && !current.data.getName().equalsIgnoreCase(name)) {
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            else {
                tail = null;
            }
        }
        else if (current == tail) {
            tail = current.prev;
            tail.next = null;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return true;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }
}