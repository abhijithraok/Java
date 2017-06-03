import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhijith on 04-Jun-17.
 */
public class sumOfGivenNumber {
    public static void main(String[] args) {
        String input ="";
        int sum = 0;
        System.out.println("enter number");
        ArrayList<Integer> array = new ArrayList<Integer>();
        while ( input != null ) {
            Scanner scan = new Scanner(System.in);
           String number = scan.nextLine();
           if(!number.isEmpty()) {
               array.add(Integer.parseInt(number));
           }
           else {
               break;
           }

        }
        for(int i = 0; i < array.size(); i++){
             sum += array.get(i);

        }
        System.out.println("Sum of all number is " + " " +sum);
    }
}
