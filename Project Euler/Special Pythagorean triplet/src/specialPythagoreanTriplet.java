/**
 * Created by Abhijith on 11-Jun-17.
 * Special Pythagorean triplet
 Problem 9
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class specialPythagoreanTriplet {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    // int sqt = k*k;
                    if (i < j && j < k) {
                        if ((i * i) + (j * j) == (k * k) && i != 0 && j != 0 && k != 0 & i + j + k == 1000) {
                           int sum = i * j * k;
System.out.println(sum);
                        }


                    }

                }

            }


        }
    }
}

