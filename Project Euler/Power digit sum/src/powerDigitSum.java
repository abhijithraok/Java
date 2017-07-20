/**
 * Created by Abhijith on 20-Jul-17.
 * Power digit sum
 *
 Problem 16
 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 21000?
 */

import java.math.*;

public class powerDigitSum {
    public static void main(String[] args) {
        double power = sum(1000);
        int total = 0;
        String number = new BigDecimal(power).toPlainString();
        for (int i = 0; i < number.length(); i++) {

            total += Character.getNumericValue(number.charAt(i));

        }
        System.out.println(total);

    }

    static double sum(int n) { // finds power of 2^n
        double power = Math.pow(2, n);
        return power;
    }
}
