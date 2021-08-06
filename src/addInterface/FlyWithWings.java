package addInterface;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("有翅膀会飞");
    }
}
