package Les49Recursion;

public class Restart {

    static void counter(int x) {
        System.out.println("Hello");
        if(x>0) {
            counter(x - 1);//realisation recursion
        } else {
            return;
        }

    }
}
