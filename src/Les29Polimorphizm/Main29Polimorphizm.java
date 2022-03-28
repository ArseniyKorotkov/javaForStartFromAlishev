package Les29Polimorphizm;

public class Main29Polimorphizm {
    public static void main(String[] args) {
        Animal animal1  = new Dog();
        //animal1.eat();
        //animal1.bark//error

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        Test.test(animal1);
        Test.test(dog1);
        Test.test(cat1);
    }
    /*
    public static void test(Animal animal) {
        animal.eat();
    }

     */
}
