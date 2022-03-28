package Les41AbstractClasses;

public class Main41AbstractClasses {
    public static void main(String[] args) {
        //Animal animal = new Animal();  // error - class is abstract
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        cat1.canUp();
    }
}
