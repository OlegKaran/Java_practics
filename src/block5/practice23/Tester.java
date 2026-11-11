package block5.practice23;

public class Tester {
    public static void main(String[] args) {
        System.out.println("ArrayQueueModule:");
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Первый: " + ArrayQueueModule.element());
        System.out.println("Удалён: " + ArrayQueueModule.dequeue());
        System.out.println("Удалён: " + ArrayQueueModule.dequeue());
        System.out.println("Первый: " + ArrayQueueModule.element());
        System.out.println("Размер: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("Пусто после clear: " + ArrayQueueModule.isEmpty());

        System.out.println("\nArrayQueueADT:");
        ArrayQueueADT adt = new ArrayQueueADT();
        ArrayQueueADT.enqueue(adt, 1);
        ArrayQueueADT.enqueue(adt, 2);
        ArrayQueueADT.enqueue(adt, 3);
        System.out.println("Размер: " + ArrayQueueADT.size(adt));
        System.out.println("Первый: " + ArrayQueueADT.element(adt));
        System.out.println("Удалён: " + ArrayQueueADT.dequeue(adt));
        System.out.println("Удалён: " + ArrayQueueADT.dequeue(adt));
        System.out.println("Размер: " + ArrayQueueADT.size(adt));
        ArrayQueueADT.clear(adt);
        System.out.println("Пусто после clear: " + ArrayQueueADT.isEmpty(adt));

        System.out.println("\nArrayQueue:");
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println("Размер: " + arrayQueue.size());
        System.out.println("Первый: " + arrayQueue.element());
        System.out.println("Удалён: " + arrayQueue.dequeue());
        System.out.println("Удалён: " + arrayQueue.dequeue());
        System.out.println("Размер: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("Пуста после clear: " + arrayQueue.isEmpty());

        System.out.println("\nLinkedQueue:");
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println("Размер: " + linkedQueue.size());
        System.out.println("Первый: " + linkedQueue.element());
        System.out.println("Удалён: " + linkedQueue.dequeue());
        System.out.println("Удалён: " + linkedQueue.dequeue());
        System.out.println("Размер: " + linkedQueue.size());
        linkedQueue.clear();
        System.out.println("Пуста после clear: " + linkedQueue.isEmpty());
    }
}
