public class PersonThinBuilder extends PersonBuilder{

    private Person thinPerson = new Person();

    @Override
    public void wearTshirt(){
        thinPerson.setTshirt(new ThinTshirt());
    }
    @Override
    public void wearTrousers(){
        thinPerson.setTrousers(new ThinTrousers());
    }

    @Override
    public Person makeupPerson(){
        return thinPerson;
    }
}
