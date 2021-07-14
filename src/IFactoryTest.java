public class IFactoryTest {
    public static void main(String[] args){
        IFactory operFactory = new MulFactory();
        Operation oper = operFactory.CreateOperation();
        oper.set_numberA(1);
        oper.set_numberB(2);
        System.out.println("结果：" + oper.GetResult());
    }
}
