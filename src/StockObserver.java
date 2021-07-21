public class StockObserver implements Observer{
    private String name;
    private Subject sub;

    public StockObserver(String name, Subject sub){
        super();
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update(){
        System.out.println(sub.getAction()+name+"关闭股票行情继续工作");
    }
}
