package Les28Modification;

import Les28Modification.Package1.Person1;

public class Main28Modification {
    public static void main(String[] args) {
        //public - open for all
        //protected - open for she package + subclasses
        //default - open for she package
        //private - open for she class

        Person1 per1 = new Person1();
        per1.name = "q";
        Person3 p3 = new Person3();
        System.out.println(p3.getName2());

    }
}
