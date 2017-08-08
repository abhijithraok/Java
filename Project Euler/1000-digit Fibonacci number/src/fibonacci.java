/**
 * Created by Abhijith on 06-Aug-17.
 */
import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.math.BigInteger;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        ArrayList<Long> fib = new ArrayList<Long>();
        long f1 = 0;
        long f2 = 1;
        long count = 0;
        for(int i = 1 ;  i <= 1000000000 ; i++){
            count++;
            f1 = f1+f2;
            f2 = f1-f2;
            String string = Long.toString(f1);
            if(string.length() == 100){
                System.out.println(string +" "+count);
            }
        }


    }

}
