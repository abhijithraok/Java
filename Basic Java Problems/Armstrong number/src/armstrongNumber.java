import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhijith on 03-Jun-17.
 */
public class armstrongNumber {
    public static void main(String[] args) {
        int cube = 0;
        int sum = 0;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        String a = scan.nextLine();
        int input = Integer.parseInt(a);
        for (int i = 0; i < a.length(); i++) {
            int currValue = Character.getNumericValue(a.charAt((i)));

            cube = currValue * currValue * currValue;
            array.add(cube);
        }
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        if (sum == input) {
            System.out.println(" Armstrong number");

        } else {
            System.out.println(" not Armstrong number");
        }


    }


}

