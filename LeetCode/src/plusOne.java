import java.math.BigInteger;
import java.util.Arrays;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element
 * in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * To DO
 */
public class plusOne {
    public static int[] plusOne(int[] digits) {
        BigInteger bigResult = new BigInteger("1");
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for (int i : digits) {
            sb.append(i);
        }

        bigResult = BigInteger.valueOf(Long.parseLong(sb.toString()));
        bigResult = bigResult.add(BigInteger.valueOf(1));
        temp = String.valueOf(bigResult);
        int[] ans = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            ans[i] = Character.getNumericValue(temp.charAt(i));

        }

        System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static void main(String[] args) {
        int[] cc = new int[]{1, 2, 3};
        int[] ab = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0,3,5,6,7,8,9,0};
        plusOne(ab);
    }
}
