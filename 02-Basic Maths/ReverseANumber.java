public class ReverseANumber {
    public static void main(String[] args) {

        int n = 30045600;
        int res = reverseANumber(n);
        System.out.println(res);
        
    }
    public static int reverseANumber(int n){
        int rev = 0;

        while(n > 0){
            
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        
        return rev;
    }
}
