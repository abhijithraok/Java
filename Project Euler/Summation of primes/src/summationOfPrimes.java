import java.util.*;

/**
 * Created by Abhijith on 12-Jun-17.
 * Summation of primes
 * Problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 * The sieve of Eratosthenes can be expressed in pseudocode, as follows:
 * <p>
 * Input: an integer n > 1.
 * <p>
 * Let A be an array of Boolean values, indexed by integers 2 to n,
 * initially all set to true.
 * <p>
 * for i = 2, 3, 4, ..., not exceeding √n:
 * if A[i] is true:
 * for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n:
 * A[j] := false.
 * <p>
 * Output: all i such that A[i] is true.
 */
public class summationOfPrimes {
    public static void main(String[] args) {
        long p = 2;
        boolean[] composite = new boolean[2000000 + 1];
        composite[1] = true;
        List<Integer> consecutiveInt = new ArrayList<>();
        for (int i = 2; i <= 2000000 - 1; i++) {
            if (!composite[i]) {
                consecutiveInt.add(i);
                int multiple = 2;
                while (i * multiple <= 2000000) {
                    composite[i * multiple] = true;
                    multiple++;
                }
            }
        }
        double sum = 0;
        for (int d : consecutiveInt) {
            sum += d;
        }
        System.out.println(sum);

    }
}