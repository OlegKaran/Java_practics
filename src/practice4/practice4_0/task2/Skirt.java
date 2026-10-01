package practice4.practice4_0.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + "\n"  + this);
    }
}
