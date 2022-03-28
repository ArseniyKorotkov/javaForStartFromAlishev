package Les26Interface;

public class Main26Interface {
    public static void main(String[] args) {
        Animal2 an = new Animal2(5);
        Human2 hu = new Human2("Bob2");
        an.showInfo();
        hu.showInfo();

        Info2 info756 = new Animal2(765);
        Info2 info5 = new Human2("Bob5");
        //info756.sayR... error

        outInfo(an);
    }

    public static void outInfo(Info2 info) {
        info.showInfo();
    }
}

