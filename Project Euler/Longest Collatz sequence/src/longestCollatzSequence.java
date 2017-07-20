/**
 * Created by Abhijith on 18-Jul-17.
 * Problem 14
 The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.
 */
import java.util.*;

public class longestCollatzSequence {
    public static void main(String[] args) {
   //     long startTime = System.currentTimeMillis();
        int largest =0;
        int num = 0;
        for (int i = 1; i < 1000000; i+=2) { // calculating only for odd number to reduce execution time
            int n = calculateCollatzSequence( i);
            if(n > largest){
                largest = n;
                num = i;
            }

        }
   //     long endTime = System.currentTimeMillis();
     //   System.out.println("That took " + (endTime - startTime) + " milliseconds");
        System.out.println(num +" has : " +largest +" steps");
    }

    public static int calculateCollatzSequence(int i) {
        int count = 0;
        long n = i;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = 3 * n + 1;
                count++;
            }

        }
        return count;
    }

}

