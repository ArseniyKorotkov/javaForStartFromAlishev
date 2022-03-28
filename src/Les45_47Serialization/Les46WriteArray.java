package Les45_47Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Les46WriteArray {
    static void write(Person[] people) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) { //Les47try with resurse
            /**********
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
             ***************/

            oos.writeInt(people.length);

            for(Person person : people){
                oos.writeObject(person);
            }

            /**
             * or...
                oos.writeObject(people);
             */

            oos.close(); //not need this string code


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
