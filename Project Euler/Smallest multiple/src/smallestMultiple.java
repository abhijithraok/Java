import java.util.*;

/**
 * Created by abhijith on 07-Jun-17.
 * Smallest multiple
 Problem 5
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class smallestMultiple {
public static void main(String [] args){
    boolean value = false;
    int n = 1;
    while ( n > 0){
        value = divisor(n);
        if( value ){
            System.out.println(n +" is smallest digit divisible by all number between 1 to 20");
            break;
        }
        n++;

        }
    }
    public static Boolean divisor(int k){
    boolean b =false;
    for(int i = 1;i < 20 ;i++){
        if(k % i == 0){
            b = true;

        }
        else{
            return false;
        }
    }
        return b;
    }

}

