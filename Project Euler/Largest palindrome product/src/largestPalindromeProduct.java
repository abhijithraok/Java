import java.util.*;

/**
 * Created by abhijith on 07-Jun-17.
 * Largest palindrome product
 Problem 4
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
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
        System.out.println("largest palindrome from product of 3 digit is " + largestPalindrome);

    }

    public static ArrayList<Integer> numbergen(int n, int first) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = first; i < n; i++) {
            numbers.add(i);

        }
        //System.out.println(numbers);
        return numbers;
    }

    public static int largestPalindrome(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> product = new ArrayList<>();
        ArrayList<Integer> largestPalindrome = new ArrayList<>();
        numbers2 = numbers;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {
                product.add(numbers.get(i) * numbers2.get(j));
            }

        }
        for (int i = 0; i < product.size(); i++) {
            int num = product.get(i);
            int n = num;
            int rev = 0;
            while (num > 0) {
                int dig = num % 10;
                rev = rev * 10 + dig;
                num = num / 10;

            }
            if (n == rev) {
                largestPalindrome.add(n);

            }
        }
        int max = Collections.max(largestPalindrome);


        return max;
    }
}
