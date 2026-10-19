package practice22;

public class Stack {
    private double[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }

    public void push(double x) {
        if (isFull()) {
            throw new IllegalStateException("Переполнение стека (Stack OverFlow)");
        }
        arr[++top] = x;
    }

    public double pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Невозможно выполнить POP для пустого стека");
        }
        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
