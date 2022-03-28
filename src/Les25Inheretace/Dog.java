package Les25Inheretace;

public class Dog extends Animal {
    public void bark() {
        System.out.println("I am barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is barking");
    }

    public void showName() {
        System.out.println(name);
    }
}
