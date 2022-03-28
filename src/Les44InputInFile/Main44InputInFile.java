package Les44InputInFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main44InputInFile {
    public static void main(String[] args) {
        File file = new File("testFile");
        PrintWriter pw;

        {
            try {
                pw = new PrintWriter(file);
                pw.println("Test1");
                pw.println("Test2");

                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }



        }

    }
}
