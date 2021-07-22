public class Forwards implements Player{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Forwards(String name){
        this.name = name;
    }

    @Override
    public void attack(){
        System.out.println("前锋" + name + "进攻");
    }

    @Override
    public void defense(){
        System.out.println("前锋" + name + "防守");
    }
}
