public class highestAltitue {
    public static int largestAltitude(int[] gain) {
        int count = 0;
        int result = 0;
        for (int alt : gain) {
            count += alt;
            if (result < count) result = count;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85,
                -39, 67, -63, 64, -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81};
        System.out.println(largestAltitude(arr));
    }
}

