package Les1_13;

public class Main12ForEach {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "My";
        str[1] = "name is";
        str[2] = "Java";

        for(String s : str) {
            System.out.println(s);
        }

        System.out.println();

        int[] nums = {1, 3, 5, 10};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
