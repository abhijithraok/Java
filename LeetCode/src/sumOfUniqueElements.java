import java.util.ArrayList;

public class sumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int freq[] =  new int[101];
        for(int i=0;i<nums.length;i++)
            freq[nums[i]]++;

        int sum=0;
        for(int i=1;i<101;i++){
            if(freq[i]==1)
                sum+=i;
        }

        return sum;

    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,2};
        System.out.println(sumOfUnique(arr));

}
    }

