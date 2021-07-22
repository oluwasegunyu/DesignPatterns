public class Guards implements Player{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Guards(String name){
        this.name = name;
    }

    @Override
    public void attack()
    {
        System.out.println("后卫" + name + "进攻");
    }


    @Override
    public void defense()
    {
        System.out.println("后卫" + name + "防守");
    }
}
