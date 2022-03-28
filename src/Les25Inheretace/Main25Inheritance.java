package Les25Inheretace;

public class Main25Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

