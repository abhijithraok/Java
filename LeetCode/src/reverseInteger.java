public class reverseInteger {
    public static int reverse(int x) {
        long result = 0;
        StringBuilder sb = new StringBuilder();
        try {
            String intValue = Integer.toString(Math.abs(x));

            for (int i = intValue.length() - 1; i >= 0; i--) {
                sb.append(intValue.charAt(i));
            }
            if (x < 0) {
                result = -1 * Integer.parseInt(sb.toString());
            } else {
                result = Integer.parseInt(sb.toString());
            }
            // System.out.println(result);
            return (int) result;
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}

