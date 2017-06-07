import java.util.*;

/**
 * Created by abhijith on 07-Jun-17.
 */
public class largestPalindromeProduct {
    public static void main(String[] args) {
        System.out.println("enter N");
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("enter First number");
        int firsNumber = scan.nextInt();
        numbers = numbergen(n, firsNumber);
        int largestPalindrome = largestPalindrome(numbers);
        System.out.println(largestPalindrome);

    }

    public static ArrayList<Integer> numbergen(int n, int first) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = first; i < n; i++) {
            numbers.add(i);

        }
        System.out.println(numbers);
        return numbers;
    }

    public static int largestPalindrome(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> product = new ArrayList<>();
        numbers2 = numbers;
        for(int i = 0; i< numbers.size(); i++){
            for(int j = 0; j<numbers2.size();j++){
                product.add(numbers.get(i)*numbers2.get(j));
            }

        }
        for(int i =0 ;i<product.size();i++){
            
        }


return 1;
    }
}
