package Les19_21;

class Human {
    //Fields
    private String name;
    private int age;
    public static String description;
/*
    public Human() {
        System.out.println("is constructor 1");
    }
 */

    public Human(String name) {
        this.name = name;
        System.out.println("is constructor 2");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("is constructor 3");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void getInfo() {
        System.out.println(name + " " + age);
    }

    public static void getDescription() {
        System.out.println(description);
    }
}
