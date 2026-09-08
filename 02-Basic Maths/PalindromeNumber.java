public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 1211;
        palindromeNumber(num);
        
    }
    public static void palindromeNumber(int num){

        int originalNum = num;
        int rev = 0;

        while(num > 0){

            int rem = num % 10;
            rev = rev * 10 + rem;
            num  =num / 10;
        }
        if(rev == originalNum){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}
