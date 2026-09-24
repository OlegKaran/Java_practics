package practice2.task5;

public class DogKennel {
    private Dog[] dogs;
    private int count = 0;

    public DogKennel(int size) { dogs = new Dog[size]; }

    public void add(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("Массив заполнен");
        }
    }

    public void printAll() {
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel(2);
        dogKennel.add(new Dog("sdfa", 10));
        dogKennel.add(new Dog("asdff", 4));
        Dog dog1 = new Dog("djfslaf", 2);
        System.out.println(dog1.toHumanAge());
        dogKennel.printAll();
    }
}
