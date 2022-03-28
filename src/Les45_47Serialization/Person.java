package Les45_47Serialization;

import java.io.Serializable;

class Person implements Serializable {

    private static final long serialVersionID = 123456L;

    private int id;
    private String name;
    static transient int countPerson = 0; //not serialization

    public Person(int id, String name ) {
        this.id = id;
        this.name = name;
        countPerson++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
