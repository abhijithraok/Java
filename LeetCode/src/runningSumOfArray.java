import java.util.Arrays;

public class runningSumOfArray {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(num)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int i = 0;
        int sumArray[] = new int[nums.length];
        for (int value : nums) {
            sum += value;
            sumArray[i] = sum;
            i++;
        }
        return sumArray;
    }
}
