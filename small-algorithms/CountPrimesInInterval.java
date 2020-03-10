public class CountPrimesInInterval {

    public static int ini = 501;
    public static int fin = 5000;

    public static void main(String[] args) {
        System.out.println(countPrime(ini, fin));
    }

    public static int countPrime(int ini, int fin) {
        int divisors = 0, primes = 0;

        for (int i = ini; i < fin; i++) {
            divisors = 0;

            for (int x = i; x >= 1; x--) {
                if (i % x == 0) {
                    divisors++;
                }
            }

            if (divisors == 2) {
                primes++;
            }
        }

        return primes;
    }

}
