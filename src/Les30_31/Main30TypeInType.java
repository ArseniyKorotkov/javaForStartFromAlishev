package Les30_31;

public class Main30TypeInType {
    public static void main(String[] args) {
        long g = 12345678910L;
        long l = 1234L;

        int x = (int) l;

        long l2 = x;

        float f = x + 0.5f;

        long l1 = (long)f;
        //System.out.println(f);

        byte b = (byte)129;
        System.out.println(b);
    }
}
