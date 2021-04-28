import java.util.ArrayList;
import java.util.regex.Pattern;

public class reverseStringiii {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] arr = s.split(" ");
        for( String ss : arr){
            for(int i = ss.length()-1; i >= 0; i--){
                sb.append(ss.charAt(i));

            }
            sb.append(' ');

        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }
}
