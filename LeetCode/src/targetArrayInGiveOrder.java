import java.util.ArrayList;
import java.util.Arrays;

public class targetArrayInGiveOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int ind = 0;
        ArrayList<Integer> indexlist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ind = index[i];
            indexlist.add(ind, nums[i]);
        }
        System.out.println(indexlist.toString());
        return indexlist.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int[] index = new int[]{0};
        createTargetArray(nums, index);
    }
}
