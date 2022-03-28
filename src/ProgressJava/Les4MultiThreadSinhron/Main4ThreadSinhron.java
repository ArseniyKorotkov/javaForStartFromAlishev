package ProgressJava.Les4MultiThreadSinhron;

import java.util.Scanner;

public class Main4ThreadSinhron {
    public static void main(String[] args) {
        SinhronasedThread myThread = new SinhronasedThread();
        myThread.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        myThread.close();
    }
}
