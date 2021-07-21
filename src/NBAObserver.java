public class NBAObserver implements Observer{
    private String name;
    private Subject sub;

    public NBAObserver(String name, Subject sub){
        super();
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update(){
        System.out.println(sub.getAction()+name+"关闭NBA直播，继续工作");
    }
}
