package Les45_47Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Les46ReadArray {
    static void read() {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int counter = ois.readInt();
            Person[] people = new Person[counter];

            for(int q = 0; q < counter; q++) {
                people[q] = (Person)ois.readObject();
            }
             /**
              * or...
                Person[] people = (Person[])ois.readObject();
              */

            System.out.println(Arrays.toString(people));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
