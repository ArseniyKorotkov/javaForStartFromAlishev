package Les43ClassesInClass;

public class ElectroCar {
    private int id;
    private static int baterryLow;

    //nonstatic input class
    private class Motor {
        void start() {
            System.out.println("Motor car " + id + " is starting");
        }
    }

    //static input class
    public static class Battery {
        void charge() {
            System.out.println("Battery is charging" + baterryLow);
        }
    }

    public ElectroCar (int id) {
        this.id = id;
    }

    void start() {
        Motor motor = new Motor();
        motor.start();

        int powerWeight = 19;
        //metod input class
        class Weight {
            void weighting() {
                System.out.println(id);
                System.out.println(powerWeight);
            }
        }

        System.out.println("Electrocar " + id + " is starting");
    }
}
