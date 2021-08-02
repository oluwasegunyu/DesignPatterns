public class Man extends Person{
    @Override
    public void accept(States state){
        state.getManConclusion(this);
    }
}
