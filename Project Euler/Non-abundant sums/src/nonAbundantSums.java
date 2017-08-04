/**
 * Created by Abhijith on 03-Aug-17.
 * Non-abundant sums
 Problem 23
 A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

 A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

 As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

 Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */

import java.util.*;

public class nonAbundantSums {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> abundantNumberList = new ArrayList<>();
        for (int i = 10; i < 28123; i++) {
            int number = abundantNumber(i);
            if (number != 0) {
                abundantNumberList.add(number);
            }
        }
        boolean[] canBeWritten = sumOfAbundantNumber(abundantNumberList);
        sumOfAllNumber(canBeWritten);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static int sumOfAllNumber(boolean[] canBeWritten) {
        int sum = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!canBeWritten[i]) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int abundantNumber(int n) {  // finding all abundantnumber less than limit
        int abundant = 0;
        int sumOfDivisor = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisor += i;
            }
        }
        if (sumOfDivisor > n) {
            abundant = n;
        }
        return abundant;
    }

    // // mark all the sums of two abundant numbers in boolean array of limit+1
    public static boolean[] sumOfAbundantNumber(ArrayList<Integer> numList) {
        int limit = 28123;
        boolean[] nonAbundantNum = new boolean[limit + 1];
        for (int i = 0; i < numList.size(); i++) {
            for (int j = i; j < numList.size(); j++) {
                if (numList.get(i) + numList.get(j) <= limit) {
                    nonAbundantNum[numList.get(i) + numList.get(j)] = true;
                } else {
                    break;
                }
            }
        }
      //System.out.println(Arrays.toString(nonAbundantNum));
        return nonAbundantNum;

    }
}