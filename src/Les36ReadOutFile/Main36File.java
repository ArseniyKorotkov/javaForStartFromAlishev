package Les36ReadOutFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main36File {
    public static void main(String[] args) throws FileNotFoundException {
        String se = File.separator;

        File text2 = new File("C:"+se+"Users"+se+"dorda"+se+"IdeaProjects"+se+"javaForStartFromAlishev"+se+"src"+se+"Les36ReadOutFile"+se+"Test36.txt");
        //or if file in project input way to project
        File text = new File("src"+se+"Les36ReadOutFile"+se+"Test36.txt");

        Scanner sc = new Scanner(text);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();

        //bonus
        System.out.println("Bonus");
        String bonus1 = "123 456";
        String[] bo = bonus1.split(" ");
        for (String st : bo) {
            System.out.println(st + " String");
        }

        int num1 = Integer.parseInt(bo[1]);
        System.out.println(num1 + " Integer");

    }
}
