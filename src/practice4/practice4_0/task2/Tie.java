package practice4.practice4_0.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: " + "\n"  + this);
    }
}