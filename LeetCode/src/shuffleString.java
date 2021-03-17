import java.util.HashMap;

public class shuffleString {
    public static String restoreString(String s, int[] indices) {
        HashMap<Integer, String> indiceMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            indiceMap.put(indices[i], Character.toString(s.charAt(i)));
        }
        indiceMap.forEach((k, v) -> ans.append(v));
        return ans.toString();
    }

    public static void main(String[] args) {
        int[] indices = new int[]{3, 1, 4, 2, 0};
        System.out.println(restoreString("aiohn", indices));
    }
}