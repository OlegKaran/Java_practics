package practice13.task3;

public class Tester {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.parseStringWithSplit("Россия, Московская область, Москва, Тверская, 12, 1, 45");
        System.out.println(address1);

        Address address2 = new Address();
        address2.parseStringWithSplit("Беларусь, Минская область, Минск, Ленина, 5, 4, 12");
        System.out.println(address2);

        Address address3 = new Address();
        address3.parseStringWithTokenizer("Казахстан. Алматинская область. Алматы. Абая. 102. 2. 8");
        System.out.println(address3);

        Address address4 = new Address();
        address4.parseStringWithTokenizer("Россия. Ленинградская область. Санкт-Петербург. Невский. 25. 13. 101");
        System.out.println(address4);
    }
}

