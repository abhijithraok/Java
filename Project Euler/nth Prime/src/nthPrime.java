import java.util.ArrayList;

/**
 * Created by Abhijith on 09-Jun-17.
 * 10001st prime
 Problem 7
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
public class nthPrime {
    public static void main(String [] args) {
        int j = 1;
        ArrayList<Integer> prime = new ArrayList<>();
        boolean number;
        while (prime.size() < 20000){
        //for (int i = 1; i < 20000; i++) {

            number = IsPrime(j);
            if (number) {
                prime.add(j);
            }
            j++;
        }
        System.out.println(prime.get(10001));
    }

    public static boolean IsPrime(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;

    }
}

