package practice24.task2;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public String toString() {
        return "Викторианский стул с возврастом: "  + age;
    }
}
