import java.util.Scanner;

/**
 * Created by abhij on 05-Jun-17.
 */
public class StringRevWithoutPredefinedMethod {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        System.out.println(output);
    }
}
