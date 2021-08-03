public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }
    public Person dressPerson(){
        pb.wearTrousers();
        pb.wearTshirt();
        return pb.makeupPerson();
    }
}
