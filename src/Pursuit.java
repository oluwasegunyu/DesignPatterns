public class Pursuit implements IGiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    public void GiveDolls(){
        System.out.println("送你娃娃");
    }
    public void GiveFlowers(){
        System.out.println("送你花");
    }
    public void GiveChocolate(){
        System.out.println("送你巧克力");
    }
}
