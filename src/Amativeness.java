public class Amativeness extends States {
    @Override
    public void getManConclusion(Man concreteElementA){
        System.out.println(concreteElementA.getClass().getName() + " " + this.getClass().getName()+ "时，背后多半有一个伟大的女人。");
    }

    public void getWomanConclusion(Woman concreteElementB){
        System.out.println(concreteElementB.getClass().getName() + " " + this.getClass().getName() + "时， 背后多半有个不成功的男人");
    }
}
