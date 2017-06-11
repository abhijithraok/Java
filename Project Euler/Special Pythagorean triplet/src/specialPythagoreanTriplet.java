/**
 * Created by Abhijith on 11-Jun-17.
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

