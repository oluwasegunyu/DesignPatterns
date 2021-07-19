public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
        System.out.println("Cloned: " + c1.getId());
    }
}
