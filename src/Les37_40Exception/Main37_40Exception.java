package Les37_40Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main37_40Exception {
    public static void main(String[] args) {
        //easy
        File file = new File("asdf");
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //class
        try {
            ReadText.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //MyException
        try {
            MyException.notZero();
        } catch (IOException | ReallyMyException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        UnChecked.unchecked();
    }
}
