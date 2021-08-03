public class PersonFatBuilder extends PersonBuilder{

    private Person fatPerson = new Person();

    @Override
    public void wearTshirt(){
        fatPerson.setTshirt(new FatTshirt());
    }
    @Override
    public void wearTrousers(){
        fatPerson.setTrousers(new FatTrousers());
    }

    @Override
    public Person makeupPerson(){
        return fatPerson;
    }
}
