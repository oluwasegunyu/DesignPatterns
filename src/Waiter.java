import java.util.ArrayList;
import java.util.Date;

public class Waiter {
    private ArrayList<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        if(command.toString() == "BakeChickenWingCommand"){
            System.out.println("鸡翅没有了，请点别的");
        }else{
            orders.add(command);
            System.out.println("增加订单:" + command.toString() + " 时间: " + new Date());
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单: " + command.toString() + " 时间: " + new Date());
    }

    public void notifyBoy(){
        for (Command cmd: orders) {
           cmd.excuteCommand();
        }
    }
}
