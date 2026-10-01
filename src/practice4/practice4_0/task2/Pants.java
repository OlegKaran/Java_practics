package practice4.practice4_0.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: " + "\n"  + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: " + "\n"  + this);
    }
}
