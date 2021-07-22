public class PlayerTest {
    public static void main(String... args){
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.defense();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
