public class ProxyTest {
    public static void main(String[] args){
        SchoolGirl jiao = new SchoolGirl();
        jiao.setName("娇娇");

        Proxy daili = new Proxy(jiao);

        daili.GiveChocolate();
        daili.GiveDolls();
        daili.GiveFlowers();
    }
}
