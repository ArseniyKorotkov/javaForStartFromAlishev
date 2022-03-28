package ProgressJava.Les3MultiThreadStream;

public class Runner implements Runnable{
    @Override
    public void run() {
        for(int q = 0; q < 100; q++) {
            System.out.println("HelloRrrrrrrrrrrrruuuuuunnnnnn!!!!!");
        }
    }
}
