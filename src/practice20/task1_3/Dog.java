package practice20.task1_3;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "лает");
    }
}
