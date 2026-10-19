package practice17;

import java.util.Scanner;

public class CircularLinkedList {
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public CircularLinkedList() {
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
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public boolean removeNode(String name) {
        if (isEmpty()) {
            return false;
        }
        Node current = head;
        Node prev = tail;
        do {
            if (current.data.getName().equalsIgnoreCase(name)) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                }
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                else {
                    prev.next = current.next;
                }
            }
            prev = current;
            current = current.next;
        } while (current != head);
        return false;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        do {
            current.data.display();
            current = current.next;
        } while (current != head);
    }

    public void clear() {
        head = null;
        tail = null;
    }
}

