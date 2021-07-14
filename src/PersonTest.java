public class PersonTest {
    public static void main(String[] args){
        Person xc = new Person("小菜");

        TShirts dtx = new TShirts();
        BigTrouser kk = new BigTrouser();

        dtx.Decorate(xc);
        kk.Decorate(dtx);
        kk.Show();
    }
}
