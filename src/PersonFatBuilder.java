public class PersonFatBuilder extends PersonBuilder{
    @Override
    public void buildHead(){
        System.out.println("大头");
    }
    @Override
    public void buildBody(){
        System.out.println("大身体");
    }
    @Override
    public void buildArmLeft(){
        System.out.println("大左手");
    }
    @Override
    public void buildArmRight(){
        System.out.println("大右手");
    }
    @Override
    public void buildLegRight(){
        System.out.println("大右脚");
    }
    @Override
    public void buildLegLeft(){
        System.out.println("大左脚");
    }
}
