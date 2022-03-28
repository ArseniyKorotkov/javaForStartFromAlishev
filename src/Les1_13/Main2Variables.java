package Les1_13;

public class Main2Variables { //переменные
    public static void main(String[] args) {

        byte myByte = 45; // размер 8 бит (1 байт), диапазон от -128 до 127
        short myShort = 56; // размер 16 бит (2 байта), диапазон от -32768 до 32767
        int myInt = 67; // размер 32 бита (4 байта), диапазон от -2_147_483_648 до 2_147_483_647
        long myLong = Long.MIN_VALUE; // размер 64 бита (8 байтов), диапазон от -9_223_372_036_854_775_808
                                                                           // до 9_223_372_036_854_775_807

        float myFloat = 4.6f; // 32-битный ~6-7 десятичных цифр
        double myDooble = 6.8; // 64-битный ~14-16 десятичных цифр

        char myChar = 'd'; // 2 байта = 16 бит

        boolean myBoolean = true; // true, false

        System.out.println(myDooble);
    }
}
