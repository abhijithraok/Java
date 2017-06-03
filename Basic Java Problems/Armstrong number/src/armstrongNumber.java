import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhijith on 03-Jun-17.
 */
public class armstrongNumber {
    public static void main(String[] args) {
        int cube = 0;
        int sumOfCubes = 0;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        String inputString = scan.nextLine();
        int inputNumber = Integer.parseInt(a);
        for (int i = 0; i < a.length(); i++) {
            int b = Character.getNumericValue(inputString.charAt((i)));

            cube = b * b * b;
            array.add(cube);
        }
        for (int i = 0; i < array.size(); i++) {
            sumOfCubes += array.get(i);
        }
        if (sumOfCubes == inputNumber) {
            System.out.println(" Armstrong number");

        } else {
            System.out.println(" not Armstrong number");
        }


    }


}

