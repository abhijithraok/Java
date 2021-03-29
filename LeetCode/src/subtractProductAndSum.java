public class subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        String number = Integer.toString(n);
        int sum = 0;
        int product = 1;
        int result = 0;
            for(int i = 0; i < number.length(); i++){
                sum += Character.getNumericValue(number.charAt(i));
                product *= Character.getNumericValue(number.charAt(i));
            }
            result = product - sum;
            return Math.abs(result);
    }
    public static void main(String[] args){
        subtractProductAndSum(234);
    }

}