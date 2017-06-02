import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhijith on 02-Jun-17.
 */
public class ascendingOrder {
    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        int [] ascending = new int[5];
        for(int i = 0; i < ascending.length; i ++) {
            Scanner scan = new Scanner(System.in);
            String  s = scan.nextLine();
            if (!s.isEmpty()) {
                ascending[i] = Integer.parseInt(s);
            } else {
               break;
            }
        }
            int[] a = new int[5];

            ascendingOrder b = new ascendingOrder();
            a = b.order(ascending);
            for(int i = 0 ; i < a.length;i++){
                System.out.println(a[i]);
            }

        }



    public  int [] order(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = i +1 ; j< array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }
        }


        return array;
    }
}
