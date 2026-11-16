package block6.practice28.task3;

public class FloatHashTableTester {
    public static void main(String[] args) {
        FloatHashTable hashTable = new FloatHashTable(10);
        hashTable.hashtabAdd(9.321f, "Гарри Поттер");
        hashTable.hashtabAdd(5.6f, "Звездные войны");
        hashTable.hashtabAdd(9.856f, "Мстители");
        hashTable.hashtabAdd(9.321f, "Железный человек");
        System.out.println("Фильм по ключу 9.321: " + hashTable.hashtabLookup(9.321f));
        hashTable.hashtabDelete(5.6f);
        System.out.println("Фильм по ключу: 5.6: " + hashTable.hashtabLookup(5.6f));
    }
}
