package Les32RefomClasses;

class Main32ReformUpDownCasting {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
         //Upcasting
        Animal animalDog = new Dog();
        animalDog.eat();

        //Downcasting
        Dog dogAnimal = (Dog) new Animal();
        dogAnimal.eat();
        dogAnimal.bark();//error Animal can not bark!!!
    }
}
