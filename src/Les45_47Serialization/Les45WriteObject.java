package Les45_47Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Les45WriteObject {
    static void write(Object o, Object o2) {
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(o);
            oos.writeObject(o2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
