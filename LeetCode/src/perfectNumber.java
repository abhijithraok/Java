/**A perfect number is a positive integer that is equal to the sum of its positive divisors,
 *  excluding the number itself.
 * A divisor of an integer x is an integer that can divide x evenly.
 Given an integer n, return true if n is a perfect number, otherwise return false.
 *
 */
public class perfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int result = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                result += i;
            }

            }
        if (result == num) {
            return true;


        }
        return false;
    }
public static void main(String[] args){
        System.out.println(checkPerfectNumber(2016));
}
}
