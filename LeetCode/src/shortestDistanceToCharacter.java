import java.util.Arrays;

public class shortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] res = new int[len];
        int prev = -len;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c)   prev = i;
            res[i] = i - prev;
        }

        prev = len * 2;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == c)   prev = i;
            res[i] = Math.min(res[i], prev - i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }






    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        shortestToChar(s,c);


    }
}