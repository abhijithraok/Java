import java.util.*;

public class checkStringEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sbWord1 = new StringBuilder();
        StringBuilder sbWord2 = new StringBuilder();
        if (word1.length == word2.length) {
            for (int i = 0; i < word1.length; i++) {
                sbWord1.append(word1[i]);
                sbWord2.append(word2[i]);
            }
            if (sbWord1.toString().equals(sbWord2.toString())) {
                return true;
            }
        }
        for (String s : word1) {
            sbWord1.append(s);
        }
        for (String s : word2) {
            sbWord2.append(s);

        }
        if (sbWord1.toString().equals(sbWord2.toString())){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"a", "bc"};
        String[] word2 = new String[]{"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));

    }
}

