/**
 * Created by Abhijith on 04-Aug-17.
 * Lexicographic permutations
 Problem 24
 A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

 012   021   102   120   201   210

 What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */

import java.util.*;

public class lexicographicPermutations {
    public static ArrayList<String> perm = new ArrayList<>();

    public static void main(String[] args) {
        permutation("0123456789");

        System.out.println(perm.get(999999));
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int count = 1;
        int n = str.length();
        if (n == 0) {
            perm.add(prefix);
            //  System.out.println(prefix );


        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));

        }

    }
}