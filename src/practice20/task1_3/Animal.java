package practice20.task1_3;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " издаёт звук");
    }

    @Override
    public String toString() {
        return name + ", " + age + " лет";
    }
}
