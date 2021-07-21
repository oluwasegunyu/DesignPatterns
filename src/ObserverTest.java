public class ObserverTest {
    public static void main(String[] args){
        Boss boss = new Boss();
        StockObserver colleges1 = new StockObserver("老魏", boss);
        NBAObserver colleges2 = new NBAObserver("老易", boss);

        boss.attach(colleges1);
        boss.attach(colleges2);

        boss.setAction("我回来了");

        boss.Notify();
    }
}
