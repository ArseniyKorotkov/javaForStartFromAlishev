package Les14_18;

public class Main14_18ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        //person1.name = "Roman";
        //person1.age = 26;
        person1.setNameAndAge("", 26);
        //System.out.println("My name is " + person1.name + ", I have " + person1.age + " years");
        person1.speak();
        person1.sayRelax();

        Person person2 = new Person();
        String name2 = "Igor";
        //person2.name = "Igor";
        //person2.age = 20;
        person2.setNameAndAge(name2, 20);

        //System.out.println("My name is " + person2.name + ", I have " + person2.age + " years");
        person2.sayHello();
    }
}
