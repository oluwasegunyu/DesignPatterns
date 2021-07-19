public class Fund {
    Stock1 g1;
    Stock2 g2;
    Stock3 g3;
    NationalDebt1 n1;
    Realty1 r1;

    public Fund(){
        g1 = new Stock1();
        g2 = new Stock2();
        g3 = new Stock3();
        n1 = new NationalDebt1();
        r1 = new Realty1();
    }

    public void buyFund(){
        g1.buy();
        g2.buy();
        g3.buy();
        n1.buy();
        r1.buy();
    }

    public void sellFund(){
        g1.sell();
        g2.sell();
        g3.sell();
        n1.sell();
        r1.sell();
    }
}
