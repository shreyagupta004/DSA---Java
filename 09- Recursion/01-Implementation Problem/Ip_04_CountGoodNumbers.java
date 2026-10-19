public class Ip_04_CountGoodNumbers {
    static final long MOD = 1000000007;
    public static void main(String args[]){
        int res = countGoodNumbers(4);
        System.out.println(res);
    }
    public static int countGoodNumbers(long n){

        long even = findPower(5, (n+1)/2);
        long odd = findPower(4,n/2);
        return (int) ((even * odd) % MOD);
    }
    public static long findPower(long x, long n){

        if(n == 0) return 1;

        long half = findPower(x, n / 2);
        long result = (half * half) % MOD;

        if(n % 2 == 1) result = (result * x) % MOD;
        return result;
    }
}
