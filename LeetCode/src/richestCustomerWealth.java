public class richestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                tempSum += accounts[i][j];
            }
            if (tempSum >= sum) {
                sum = tempSum;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{3,2,1}};
        maximumWealth(arr);
    }
}

