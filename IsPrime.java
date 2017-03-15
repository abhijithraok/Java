public class IsPrime {
    public static void main(String[] args) {
        boolean number;
       System.out.println(1);
        for (int i = 2; i < 1000; i++) {
            number =IsPrime(i);
            if (number)
                System.out.println(i);
        }
    }

    public static boolean IsPrime(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;

    }
}