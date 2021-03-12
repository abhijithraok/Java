public class jewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int numJewels = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewels.charAt(i)) {
                    numJewels += 1;
                }
            }
        }
        return numJewels;

    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}

