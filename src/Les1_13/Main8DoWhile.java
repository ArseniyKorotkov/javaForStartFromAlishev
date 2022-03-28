package Les1_13;

import java.util.Scanner;

public class Main8DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        do {
            System.out.println("Enter 5");
            val = sc.nextInt();
        } while (val != 5);

        /* bad code (double code)
      - System.out.println("Enter 5");
     -- int val = sc.nextInt();
        while (val != 5) {
       -    System.out.println("Enter 5");
      --    val = sc.nextInt();
        }
         */
        System.out.println("5 in entering");
    }
}
