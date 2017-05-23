import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhij on 06-May-17.
 */
public class Duplicate {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        String s = "aa";
        String temp;
        String a;
        outerloop:
        while (s != null && !s.isEmpty() ) {
            Scanner input = new Scanner(System.in);
            temp = input.nextLine();
            if (temp.equals(s)) {
                System.out.println("duplicate is a" + "  " + temp);
                break outerloop;
            } else {
                s = temp;
                array.add(s);
            }
            // s = temp;
            // array.add(s);
            for (int i = 0; i < array.size(); i++) {
                for (int j = i + 1; j < array.size(); j++) {
                    if ( array.get(i).equals(array.get(j))) {
                        System.out.println("duplicate is " + array.get(j));
                        break outerloop;

                    }

                }
            }
        }
        System.out.println("array is " + array);
    }

}

