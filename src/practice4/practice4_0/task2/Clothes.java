package practice4.practice4_0.task2;

public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Размер футболки: " + size + " (" + size.getDescription() + ")" + "\n" +
                "Цена: " + price  + " рублей" + "\n" +
                "Цвет: " + color;
    }
}
