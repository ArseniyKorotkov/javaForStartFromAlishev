package Les45_47Serialization;

public class Main45_47 {
    public static void main(String[] args) {
        Person person1 = new Person(5, "Andy");
        Person person2 = new Person(34, "Andriy");

        Person[] people = { new Person(6, "Bobby"),
                            new Person(36, "Bob") };

        Les45WriteObject.write(person1, person2);
        Les45ReadObject.read();

        Les46WriteArray.write(people);
        Les46ReadArray.read();

    }
}
