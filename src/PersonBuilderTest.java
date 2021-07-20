public class PersonBuilderTest {
    public static void main(String[] args) {
        PersonThinBuilder ptb = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();

        PersonFatBuilder pfb = new PersonFatBuilder();
        PersonDirector pdFat = new PersonDirector(pfb);
        pdFat.createPerson();
    }
}
