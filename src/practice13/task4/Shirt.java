package practice13.task4;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String shirtStr) {
        String[] parts = shirtStr.split(",");
        this.id = parts[0].trim();
        this.description = parts[1].trim();
        this.color = parts[2].trim();
        this.size = parts[3].trim();
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Описание: " + description + "\n" +
                "Цвет: " + color + "\n" +
                "Размер: " + size + "\n";
    }
}

