import java.util.Scanner;

/**
 * Created by abhij on 06-Jun-17.
 */
public class primeFactor {
    public static void main(String [] args){
        primeFactor a = new primeFactor();
        System.out.println("Enter a Integer");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int prime = a.isPrime(input);
    }
    public int isPrime(int input){
        for(int i = 2; i < input;i++){
            if(i % input != 0){



            }
        }

        return 1;
    }
}
