public class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void excuteCommand(){
        receiver.bakeChickenWing();
    }

    @Override
    public String toString(){
        return "BakeChickenWingCommand";
    }
}
