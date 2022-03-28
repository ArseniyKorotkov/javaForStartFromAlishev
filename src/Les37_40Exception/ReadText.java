package Les37_40Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText {
    public static void read() throws FileNotFoundException {
        File file = new File("asdf");
        Scanner sc = new Scanner(file);
    }
}
