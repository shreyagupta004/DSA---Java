import java.util.*;
public class checkIfAStringIsPalindromeOrNOt{
    public static void main(String args[]){
        String  s = "MADAM";
        boolean ans = palindromeOrNot(0, s, s.length());

        System.out.println(ans);
    }
    public static boolean palindromeOrNot(int i , String s ,int n){
        
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n - i - 1)){
            return false;
        }
        return palindromeOrNot(i + 1 ,s,n);
    }
}