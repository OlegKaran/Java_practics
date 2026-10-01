package practice4.practice4_0.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: " + "\n"  + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " + "\n"  + this);
    }
}
