import java.util.Scanner;

/**
 * Created by abhijith on 06-Jun-17.
 * Multiples of 3 and 5
 Problem 1
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class multiples {
    public static void main(String[] args) {
        multiples a = new multiples();
        System.out.println(" Enter N");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        System.out.println("enter 1st multiple");
        int input1 = scan.nextInt();
        System.out.println("enter 2nd multiple");
        int input2 = scan.nextInt();
        int sum = a.multiplesOfNumber(input1, input2, maxNumber);
        System.out.println(sum);
    }

    public int multiplesOfNumber(int input1, int inpu2, int max) {
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if (i % input1 == 0 || i % inpu2 == 0) {
                sum += i;

            }
        }

        return sum;
    }
}
