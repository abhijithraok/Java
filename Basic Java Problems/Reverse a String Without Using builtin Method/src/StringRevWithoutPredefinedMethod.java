import java.util.Scanner;

/**
 * Created by abhij on 05-Jun-17.
 */
public class StringRevWithoutPredefinedMethod {
    public static void main(String[] args) {
        StringRevWithoutPredefinedMethod a = new StringRevWithoutPredefinedMethod();
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String palindrome = a.palindrome(input);
        System.out.print("Reverse of input: " + input +" is : " + " " +palindrome);
    }

    public String palindrome(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
       String reverse= output.toString();
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println("given input is palindrome ");
        } else {
            System.out.println("not a palindrome");
        }


        return reverse;
    }
}
