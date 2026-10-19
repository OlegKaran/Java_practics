package practice24.task2;

public class Client {
    public Chair chair;

    public void sit() {
        if (chair == null) {
            System.out.println("Стул не выбран.");
        } else {
            System.out.println("Клиент сел на: " + chair);
        }
    }

    public void sit(Chair chair) {
        this.chair = chair;
        System.out.println("Клиент сел на: " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
