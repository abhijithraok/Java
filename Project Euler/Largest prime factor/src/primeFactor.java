import java.util. *;


/**
 * Created by abhijith on 06-Jun-17.
 * Largest prime factor
 Problem 3
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class primeFactor {
    public static void main(String[] args) {
        boolean number;
        ArrayList<Long> primeNumbers = new ArrayList<Long>();
        ArrayList<Long> primeFactor = new ArrayList<>();
        System.out.println("enter Integer ");
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        primeNumbers.add((long)1);
        long largestPrimeFactor = largestPrimeFactor(input);
        System.out.println("Largest Prime Factor is "+ largestPrimeFactor);
        for (long i = 2; i < input; i++) {
            number =IsPrime(i);
            if (number)
                primeNumbers.add(i);
        }
        System.out.println(primeNumbers);


    }

    public static boolean IsPrime(long k) {
        for (long i = 2; i < k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;


    }
    public static long largestPrimeFactor(long input){
        long i =2;
        while(input > 1){
            if(input%i == 0){
                input = input/i;

            }
            else i = i+1;

        }
        return  i;
    }
}