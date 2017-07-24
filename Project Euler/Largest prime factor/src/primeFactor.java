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

        System.out.println("enter Integer ");
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();

        long largestPrimeFactor = largestPrimeFactor(input);
        System.out.println("Largest Prime Factor is "+ largestPrimeFactor);


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