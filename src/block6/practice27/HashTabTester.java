package block6.practice27;

public class HashTabTester {
    public static void main(String[] args) {
        HashTab hashtab = new HashTab(10);
        hashtab.hashtabAdd("Карановский", "10");
        hashtab.hashtabAdd("Шапаренко", "9");
        hashtab.hashtabAdd("Денис", "4");
        hashtab.hashtabAdd("Гарибян", "5");
        hashtab.hashtabAdd("Киримов", "8");
        hashtab.hashtabAdd("Леня", "3");
        hashtab.hashtabAdd("Эдмон", "10");
        hashtab.hashtabAdd("Олег", "9");
        hashtab.hashtabAdd("Попов", "5");
        hashtab.hashtabAdd("Васильев", "3");
        System.out.println("Элемент по ключу Карановский: " + hashtab.hashtabLookup("Карановский"));
        hashtab.hashtabDelete("Карановский");
        System.out.println("Элемент по ключу Карановский: " + hashtab.hashtabLookup("Карановский"));
    }
}
