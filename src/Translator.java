public class Translator implements Player{
    private String name;
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name){
        this.name = name;
        foreignCenter.setName(name);
    }

    @Override
    public void attack(){
        foreignCenter.进攻();
    }

    @Override
    public void defense(){
        foreignCenter.防守();
    }
}
