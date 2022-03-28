package ProgressJava.Les3MultiThreadStream;

public class Main3MultiThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();

        Thread.sleep(8);

        Thread runner = new Thread(new Runner());
        runner.start();

        Thread.sleep(8);

        for(int q = 0; q < 100; q++) {
            System.out.println("Bye");
        }
    }
}
