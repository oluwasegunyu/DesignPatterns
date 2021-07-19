public class StockTest {
    public static void main(String[] args){
        Stock1 g1 = new Stock1();
        Stock2 g2 = new Stock2();
        Stock3 g3 = new Stock3();
        NationalDebt1 n1 = new NationalDebt1();
        Realty1 r1 = new Realty1();

        g1.buy();
        g2.buy();
        g3.buy();
        n1.buy();
        r1.buy();

        g1.sell();
        g2.sell();
        g3.sell();
        n1.sell();
        r1.sell();
    }
}
