/**
 * Created by abhij on 02-Mar-17.
 */
public class Exercise1b {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print("n");
            }
            x = x + 1;
            if( x > 1){
                System.out.print("");
            }
        }
    }
}