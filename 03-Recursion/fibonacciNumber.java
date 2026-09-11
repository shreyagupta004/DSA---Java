public class fibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(10));
    }
    public static int fibonacciNumber(int n){
        if(n <= 1){
            return n;
        }
    int last = fibonacciNumber(n - 1);
    int sLast = fibonacciNumber(n - 2);
    return last + sLast;
    }
}
