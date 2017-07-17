/**
 * Created by Abhijith on 17-Jul-17.
 * Large sum
 * Problem 13
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * from digit text File
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class largeSum {
    public static void main(String[] args) throws FileNotFoundException {
        BigInteger sum = new BigInteger("0");
        Scanner scan = new Scanner(new File("digit.txt"));

        while (scan.hasNextBigInteger()) {
            BigInteger big = scan.nextBigInteger();
            sum = sum.add(big);

        }
        String bigInterValueToString = sum.toString();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(bigInterValueToString.charAt(i));
        }
        System.out.println(sb);
    }


}

