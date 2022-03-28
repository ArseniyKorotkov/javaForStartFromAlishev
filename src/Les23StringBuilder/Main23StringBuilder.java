package Les23StringBuilder;

public class Main23StringBuilder {
    public static void main(String[] args) {
        //sava speed for often conconctination
        String str = "Hello";
        str = "new" + str;
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("Hello2");
        System.out.println(str2);
        str2.append("Bue");
        System.out.println(str2);

        System.out.printf("%f %s, Mike%d %n", 6.67, str2, 5);
        System.out.printf("Number %6d %n", 4567);
        System.out.printf("Number %6d %n", 123456789);

        System.out.printf("Number %-10d string %n", 4567);
        System.out.printf("Number %-10d string %n", 1234567);

        System.out.printf("%.34f", 4.769876);

    }
}
