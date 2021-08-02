public class Woman extends Person{
    @Override
    public void accept(States visitor){
        visitor.getWomanConclusion(this);
    }
}
