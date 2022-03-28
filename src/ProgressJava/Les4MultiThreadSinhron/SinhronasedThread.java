package ProgressJava.Les4MultiThreadSinhron;

public class SinhronasedThread extends Thread  {
    private volatile boolean b = true;//not cache file and two threads reads this boolean onetime
    @Override
    public void run() {

        while(b) {
            System.out.println("Hello");
        }
    }

    public void close() {
        b = false;
    }
}
