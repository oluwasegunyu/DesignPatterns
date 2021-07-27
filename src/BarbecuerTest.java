public class BarbecuerTest {
    public static void main(String... args){
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenCommand1  = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.notifyBoy();
        girl.setOrder(bakeChickenCommand1);
        girl.notifyBoy();
        girl.setOrder(bakeMuttonCommand2);
        girl.notifyBoy();
        girl.setOrder(bakeChickenCommand1);
        girl.notifyBoy();
    }
}
