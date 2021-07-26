import org.omg.CORBA.ObjectHelper;

public class IteratorTest {
    public static void main(String... args){
        ConcreteAggregate a = new ConcreteAggregate();

        a.setItems(0, "大鸟");
        a.setItems(1, "小菜");
        a.setItems(2, "行李");
        a.setItems(3, "老外");
        a.setItems(4, "内部员工");
        a.setItems(5, "小偷");

        Iterator i = new ConcreteIterator(a);

        Object item = i.first();
        while (!i.isDone()){
            System.out.println(i.currentItem() + "请买票");
            i.next();
        }
    }
}
