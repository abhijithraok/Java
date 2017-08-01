/**
 * Created by Abhijith on 01-Aug-17.
 * Problem 20
 n! means n × (n − 1) × ... × 3 × 2 × 1

 For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

 Find the sum of the digits in the number 100!
 */

import java.math.*;
import java.util.Scanner;

public class factorialDigitSum {
    public static void main(String[] args) {
     /*    System.out.println("enter n");
          Scanner scan = new Scanner(System.in);
           int value = scan.nextInt();        */
        String factor = factorial(100);
        sumOfDigit(factor);
    }

    private static String factorial(int n) {                  //method to find factors
        BigInteger factor = new BigInteger("1");

        for (long i = 1; i <= n; i++) {
            factor = factor.multiply(BigInteger.valueOf(i));
        }

        String factorial = factor.toString();               //converting bigInteger to string
        return factorial;
    }

    private static void sumOfDigit(String factor) {            //method to find sum of each digit in factors
        int sum = 0;
        for (int i = 0; i < factor.length(); i++) {
            sum += Character.getNumericValue(factor.charAt(i));

        }
        System.out.println(sum);
    }
}
