public class balancedString {
    public static int balancedStringSplit(String s) {
        int l = 0, r = 0, res = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') l++;
            else r++;
            if (l == r) res++;
        }
        return res;
    }
}