package Les1_13;

import java.util.Scanner;

public class Main10Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 0:
                System.out.println("You are burn");
                break;
            case 10:
                System.out.println("You lessens in school");
                break;
            default:
                System.out.println("You are not baby");
        }
    }
}
