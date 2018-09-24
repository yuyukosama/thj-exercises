package c3_controlling_execution;

public class E04_Primes {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (E04_Primes.isPrime(i)) System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if(n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
