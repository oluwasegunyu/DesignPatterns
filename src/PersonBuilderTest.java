public class PersonBuilderTest {
    public static void main(String[] args) {
        PersonThinBuilder ptb = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(ptb);
        Person pt = pdThin.dressPerson();
        System.out.println("Thin person wear " + pt.getTshirt() + " " + pt.getTrousers());

        PersonFatBuilder pfb = new PersonFatBuilder();
        PersonDirector pdFat = new PersonDirector(pfb);
        Person pb = pdFat.dressPerson();
        System.out.println("Fat person wear "  + pb.getTrousers() + " " + pb.getTshirt());
    }
}
