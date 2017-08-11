/**
 * Created by Abhijith on 11-Aug-17.
 */

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int[] number = {50, 10, 4, 3, 2, 1};
        int temp = 0;
        int n = number.length;
        System.out.println(Arrays.toString(number));
        int lenght = number.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (number[j - 1] > number[j]) {
                    temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(number));
    }
}