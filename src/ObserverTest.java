public class ObserverTest {
    public static void main(String[] args){
        Secretary zizhe = new Secretary();
        StockObserver colleges1 = new StockObserver("老魏", zizhe);
        StockObserver colleges2 = new StockObserver("老易", zizhe);

        zizhe.attach(colleges1);
        zizhe.attach(colleges2);

        zizhe.setAction("老板回来了");

        zizhe.Notify();
    }
}
