package Les41AbstractClasses;

public class Cat extends Animal implements Hunter {
    @Override
    void voice() {
        System.out.println("Meow");
    }

    @Override
    public void canHunter() {
        System.out.println("I want you error");
    }
}
