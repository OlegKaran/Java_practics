package practice24.task2;

public class Tester {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Client client = new Client();

        VictorianChair victorianChair = factory.createVictorianChair();
        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст стула: " + victorianChair.getAge());

        MagicChair magicChair = factory.createMagicanChair();
        client.sit(magicChair);
        magicChair.doMagic();

        FunctionalChair functionalChair = factory.createFunctionalChair();
        client.sit(functionalChair);
        System.out.println("Сумма 5 + 10 на стуле: " + functionalChair.sum(5, 10));
    }
}
