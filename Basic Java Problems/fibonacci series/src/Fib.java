/**
 * Created by abhij on 06-Jun-17.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhij on 09-May-17.
 */
public class Fib {
    public static void main(String[] args) {
        long sum = 0;
        long f1 = 0, f2 = 1, fr = 0;
        System.out.println("enter fn");
        Scanner input = new Scanner(System.in);
        int fn = input.nextInt();
        System.out.println("enter first number either 0 or 1");
        Scanner firstNumber = new Scanner(System.in);
        f1 = firstNumber.nextLong();
        ArrayList<Long> fib = new ArrayList<Long>();


        if (f1 == 0) {
            for (long i = 0; i < fn; i++) {
                fr = f1 + f2;
                fib.add(f1);
                f1 = f2;
                f2 = fr;
            }
        } else if (f1 == 1) {
            for (long i = 0; i < fn; i++) {
                fr = f1 + f2;
                fib.add(f1);
                f1 = f2;
                f2 = fr;
            }

        } else {
            System.out.println("error");
        }
        // for finding sum of even Fibonacci

        //Even Fibonacci numbers Project euler.net #2

        for (int i = 1; i < fib.size(); i++) {
            if (fib.get(i) % 2 == 0 && fib.get(i) < 4000000) {
                sum += fib.get(i);
            }
        }


        System.out.println(fib);
        System.out.println("Sum of even fibonacci series is " + sum);

    }
}

