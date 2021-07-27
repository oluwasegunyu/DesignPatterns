public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void excuteCommand(){
        receiver.bakeMutton();
    }

    @Override
    public String toString(){
        return "BakeMuttonCommand";
    }
}
