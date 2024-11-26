import java.math.BigInteger;


public class Main {

    private static BigInteger[] cache;

    public static void main(String[] args) {
        int numberOfIts = 1000;
        cache = new BigInteger[numberOfIts];
        for (int i = 0; i < numberOfIts; i++) {
            System.out.println(fibonnacci(i));
        }
    }

    public static BigInteger fibonnacci(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        else if(cache[n] != null) {
            return cache[n];
        }
        else {
            BigInteger result = fibonnacci(n - 1).add(fibonnacci(n - 2));
            cache[n] = result;
            return result;
        }
    }

    public static long factorial(int n) {
        if(n==1) return 1;
        else return n * factorial(n-1);
    }
}