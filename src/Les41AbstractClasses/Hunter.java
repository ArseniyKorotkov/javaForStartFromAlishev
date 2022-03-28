package Les41AbstractClasses;

public interface Hunter {
    void canHunter();

    default void canUp() {
        System.out.println("I can up");
    }
}
