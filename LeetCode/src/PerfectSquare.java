/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Follow up: Do not use any built-in library function such as sqrt.
 */
public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int tempInt = 0;
        if (num == 1) return true;
        if (num == 2) return true;

        tempInt = num / 2;
        for (int i = 2; i <= tempInt; i++) {
            if (i * i == num) return true;

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2));

    }
}
