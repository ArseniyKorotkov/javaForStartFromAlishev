package Les42Equals;

import java.util.Objects;

class Person {
    int id;
    public Person(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return id == person.id;
    }

}
