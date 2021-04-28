public class fibonacciNumber {
    public static int fib(int n) {
        long f1 = 0;
        long f2 = 1;
        long sum = 0;
        for(long i = 0; i < n; i++){
            f1 = f1 + f2;
            f2 = f1 - f2;
            sum += f1;

           // System.out.println(f1);
    }
        return (int) f1;
}
public static void main(String[] args){
        System.out.println(fib(3));
}
}
