package Les1_13;

public class Main11Arrays {
    public static void main(String[] args) {
        int[] num = new int[10]; //numbers >>>>> [array]
        System.out.println(num[0]);
        System.out.println(num[1]);
        num[2] = 20;
        System.out.println(num[2]);

        for(int i = 3; i < num.length; i++) {
            num[i] = i * 10;
            System.out.println(num[i]);
        }

        System.out.println();

        int[] num2 = {0, 1, 2, 3};
        for(int i = 0; i < num2.length; i++) {
            num2[i] = i * 10;
            System.out.println(num2[i] + "arr2");
        }

    }
}
