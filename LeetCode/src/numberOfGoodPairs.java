public class numberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int numberOfPairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] == nums[j]) {
                    numberOfPairs += 1;
                }
            }

        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        int[] numbs = new int[]{1, 1, 1, 1};
        System.out.println(numIdenticalPairs(numbs));
    }
}
