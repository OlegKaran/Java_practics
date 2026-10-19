package practice24.task1;

public class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex c1 = factory.createComplex();
        Complex c2 = factory.CreateComplex(5, 3);
        Complex c3 = factory.CreateComplex(2, -7);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
