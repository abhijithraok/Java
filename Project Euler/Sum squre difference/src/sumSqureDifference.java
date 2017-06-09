/**
 * Created by Abhijith on 09-Jun-17.
 * Sum square difference
 Problem 6
 The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class sumSqureDifference {
    public static void main(String [] args){
        int count1 = 0;
        int count2 = 0;
        for (int i = 1 ; i <=100; i++){
           int j = i*i ;
            count1 +=j;
        }
        for(int i = 1 ; i <=100; i++){
            count2 += i;

        }
        count2 = count2 *count2;
        int difference = count2 - count1;
        System.out.println("Sum of square difference is " + difference);
    }
}
