import java.util.*;

public class shuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] array1 = new int[n + 1 / 2];
        int[] array2 = new int[nums.length - array1.length];
        ArrayList<Integer> ansList = new ArrayList<>();
        System.arraycopy(nums, 0, array1, 0, array1.length);
        System.arraycopy(nums, n, array2, 0, array2.length);
        for (int i = 0; i < nums.length; i++) {
            if (i < array1.length) {
                ansList.add(array1[i]);
            }
            if (i < array2.length) {
                ansList.add(array2[i]);
            }

        }
        int[] ans = ansList.stream().mapToInt(i -> i).toArray();
        return ans;


    }

}
