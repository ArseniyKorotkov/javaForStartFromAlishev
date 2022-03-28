package Les34Wildcards_Generic;

import java.util.ArrayList;
import java.util.List;

class Main34Wildcards {
    public static void main(String[] args) {
        List <Animal> animals = new ArrayList<>();
        Animal an1 = new Animal();
        Animal an2 = new Animal();
        animals.add(an1);
        animals.add(an2);

        List <Dog> dogs = new ArrayList<>();
        Dog dog1  = new Dog();
        Dog dog2  = new Dog();
        dogs.add(dog1);
        dogs.add(dog2);

        test1(animals);
        //test1(dogs); //error
    }

    public static void test1(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void test2(List<?> list) {
        // for(Animal animal : list) { ////////// only for Object
        //    System.out.println(animal);
    }

    public static void test3(List<? extends Animal> list) {
        for(Animal animal : list) { ////////// only for Animal and Downclasses
            System.out.println(animal);
        }
    }

    public static void testa(List<? super Animal> list) {
        //for(Animal animal : list) { ////////// only for Animal and Upclasses(sees is Object)
        //    System.out.println(animal);
    }


}
