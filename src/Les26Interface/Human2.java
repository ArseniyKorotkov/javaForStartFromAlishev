package Les26Interface;

public class Human2 implements Info2 {
    String y;

    public Human2(String s) {
        this.y = s;
    }

    @Override
    public void showInfo() {
        System.out.println("my name is "+y);
    }
}
