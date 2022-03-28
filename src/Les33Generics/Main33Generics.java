package Les33Generics;

import java.util.ArrayList;
import java.util.List;

public class Main33Generics {
    public static void main(String[] args) {
        ///////////Java 5/////////////////////
        List animals = new ArrayList();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add(new Animal());//add ALL
        String dog = (String) animals.get(0);
        String animal = (String) animals.get(3);//error Animal cannot be cast to class java.lang.String

        //////////////////Generics//////////////////////
        List <String> genericAnimals = new ArrayList<>();
        genericAnimals.add("dog");
        genericAnimals.add("cat");
        genericAnimals.add("frog");
        //genericAnimals.add(new Animal());//error - add ONLY STRING
        String cat = genericAnimals.get(1);

    }
}
