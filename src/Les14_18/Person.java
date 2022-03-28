package Les14_18;

class Person {
    //поля
    private String name;
    private int age;

    void speak() {
        for (int q = 0; q < 3; q++) {
            System.out.println("My name is " + name + ", I have " + age + " years");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

    int timeToRelax() {
        int relax = 65 - age;
        //System.out.println("Relax will be " + relax + " age");
        return relax;
    }

    void sayRelax() {
        System.out.println("Relax will be " + timeToRelax() + " age");
    }

    public void setNameAndAge(String userName, int userAge) {
        if (userName.isEmpty() || userAge < 0) {
            System.out.println("Error");
        } else {
            name = userName;
            age = userAge;
        }

    }

    public String getNameAndAge() {

        return name + " " + age;
    }
}
