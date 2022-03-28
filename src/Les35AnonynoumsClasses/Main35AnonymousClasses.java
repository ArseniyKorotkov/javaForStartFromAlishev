package Les35AnonynoumsClasses;

public class Main35AnonymousClasses {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal anonAnimal = new Animal() {
            @Override
            public void eat() {
                System.out.println("I an not easy animal ;)");
            }
        };

        anonAnimal.eat();


        canEat human = new canEat() {
            @Override
            public void eat() {
                System.out.println("Human is eating");
            }
        };

        human.eat();
    }
}
