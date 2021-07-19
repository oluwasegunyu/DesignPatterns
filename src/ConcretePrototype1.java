public class ConcretePrototype1 extends Prototype implements Cloneable{
    public ConcretePrototype1(String id){
        super(id);
    }

    public Prototype clone() throws CloneNotSupportedException{
       return (Prototype) super.clone();
    }
}
