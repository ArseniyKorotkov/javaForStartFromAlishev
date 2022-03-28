package Les48Enum;

public class Main48Enum {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        System.out.println(animal);//override toString in enum Animal -> sobaka
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog);
        System.out.println(frog.ordinal());//index of enum

        switch (animal) {
            case DOG:
                System.out.println("It is a dog");
                break;
            case CAT:
                System.out.println("It is a cat");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
        }
    }
}
