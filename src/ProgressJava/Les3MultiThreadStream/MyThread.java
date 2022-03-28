package ProgressJava.Les3MultiThreadStream;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int q = 0; q < 100; q++) {
            System.out.println("Hello" + q);
        }
    }
}
