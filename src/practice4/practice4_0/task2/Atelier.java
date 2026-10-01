package practice4.practice4_0.task2;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing w) {
                w.dressWomen();
            }
        }
        System.out.println();
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing m) {
                m.dressMan();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 5000, "красный"),
                new Tie(Size.L, 3000, "черный"),
                new Skirt(Size.XS, 4000, "белый"),
                new Pants(Size.S, 12000, "черный"),
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}
