import java.util.*;

public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] a = new int[]{4,2,1,1,2};
        int extraCanndies = 1;
        System.out.println(kidsWithCandies(a,extraCanndies));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;
        ArrayList<Boolean> boolList = new ArrayList<>();
        for (int i : candies) {
            if (i >= largest) {
                largest = i;
            }

        }
        for (int i : candies) {
            if (i + extraCandies >= largest) {
                boolList.add(true);
            } else boolList.add(false);
        }
        return boolList;

    }
}
