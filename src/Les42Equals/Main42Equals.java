package Les42Equals;

public class Main42Equals {
    public static void main(String[] args) {
        String s1 = "qwerty";
        String s2 = "qwerty";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2) + " equals \n");


        Person p1 = new Person(5);
        Person p2 = new Person(5);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString() == p2.toString());

        Person p3 = p1;
        System.out.print(p3.id + " ");
        p3.setId(8);
        System.out.print(p3.id + " ");
        System.out.print(p1.id + " ");

    }
}
