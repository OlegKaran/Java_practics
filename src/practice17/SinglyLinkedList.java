package practice17;

import java.util.Scanner;

public class SinglyLinkedList {
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;

    public void createEmptyList() {
        head = null;
    }

    public SinglyLinkedList() {
        createEmptyList();
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
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean removeNode(String name) {
        if (isEmpty()) {
            return false;
        }
        if (head.data.getName().equalsIgnoreCase(name)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.data.getName().equalsIgnoreCase(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
        return false;
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
    }
}
