public class Ip_01_powExponent{
    public static void main(String[] args) {

        System.out.println(pow(2, 10));
    }
    public static double pow(int x, int n){
        long m = n;
        double ans = 1;
        if(n < 0) m = -m;
        while(m > 0){
            if(m % 2 == 1){
                ans = ans * x;
                m = m - 1;
            }else{
                x = x * x;
                m = m / 2;
            }
        }
        if(n < 0) return 1 / ans;
        return ans;
    }

    //recursive approach---
    public static int findPower(int x, int n){

        if(n == 0) return 1;
        if(n < 0) return 1 / findPower(x, -n);

        int half = findPower(x, n/2);
        int result = half * half;
        
        if(n % 2 == 1){
            result = n * result;
        }
        return result;
    }
}