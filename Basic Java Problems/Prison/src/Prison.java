/**
 * Created by Abhijith on 20-Feb-18.
 *A jail has 100 prison and 100 prisoner. All doors are closed at start.first time s1 jailer opens all doors,second time s2 starts at second prison p2 closes every other locker
 * 3rd(s3) time starts with p3 and changes every 3rd prison (closes it if it was open and opens if it was closed)
 * s4 starts with 4th changes every 4 th
 * till 100th prison
**/
import java.util.*;

public class Prison {
    public static void main(String[] args) {
        boolean[] door = new boolean[1001];
         Arrays.fill(door, false); // all doors were closed at start
        for (int i = 1; i < door.length; i++) {
            for (int j = i; j < door.length; j += i) {
                if (!door[j]) {
                    door[j] = true;
                } else {
                    door[j] = false;
                }
            }
        }
        //  System.out.println(Arrays.toString(door));
        for (int i = 1; i < door.length; i++) {
            if (door[i]) {
                System.out.println("prisoner: " + i + " is free.");
            }
        }

    }
}

