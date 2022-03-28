package Les26Interface;

class Animal2 implements Info2 {
    int x;

    public Animal2(int x) {
        this.x = x;
    }

    @Override
    public void showInfo() {
        System.out.println("my id is " + x);
    }

    public void sayR() {
        System.out.println("Rrrrrrrrr");
    }
}
