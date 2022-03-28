package Les19_21;

public class Main19_21ThisAndConstructorAndStatic {
    public static void main(String[] args) {
        //Human human1 = new Human(); //error
        Human human2 = new Human("Igor");
        Human human3 = new Human("Igor", 45);
        Human.description = "Nice";
        Human.getDescription();
        human2.description = "Bad";
        human3.getDescription();


    }
}
