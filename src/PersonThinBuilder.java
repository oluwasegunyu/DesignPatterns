public class PersonThinBuilder extends PersonBuilder{
    @Override
    public void buildHead(){
        System.out.println("小头");
    }
    @Override
    public void buildBody(){
        System.out.println("小身体");
    }
    @Override
    public void buildArmLeft(){
        System.out.println("小左手");
    }
    @Override
    public void buildArmRight(){
        System.out.println("小右手");
    }
    @Override
    public void buildLegRight(){
        System.out.println("小右脚");
    }
    @Override
    public void buildLegLeft(){
        System.out.println("小左脚");
    }
}
