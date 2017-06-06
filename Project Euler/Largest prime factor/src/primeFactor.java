import java.util. *;


/**
 * Created by abhij on 06-Jun-17.
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
        for (long i = 2; i < input; i++) {
            number =IsPrime(i);
            if (number)
                primeNumbers.add(i);
        }
        System.out.println(primeNumbers);
        for(long prime : primeNumbers){
            if(input % prime == 0){
                primeFactor.add(prime);

            }

        }
        System.out.println("Largest PrimeFactor is "+ Collections.max(primeFactor));
    }

    public static boolean IsPrime(long k) {
        for (long i = 2; i < k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;

    }
}