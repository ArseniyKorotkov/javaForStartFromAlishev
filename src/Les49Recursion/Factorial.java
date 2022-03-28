package Les49Recursion;

class Factorial {
    static int fac(int x) {
        if(x == 1)
            return 1;

        return x * fac(x - 1);
    }
}
