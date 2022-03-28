package Les37_40Exception;

import java.io.IOException;
import java.util.Scanner;

public class MyException {
    static void notZero() throws IOException, ReallyMyException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(sc.nextLine());

            if (x != 0) {
                throw new ReallyMyException("I want ZERO!!!");
            }
        }
    }
}
