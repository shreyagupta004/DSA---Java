import java.util.*;
public class h_01_PalindromePartioning {
    public static void main(String[] args) {
        String s = "aaabb";
        List<List<String>> ans = new ArrayList<>();
        palindromePartition(s, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    public static void palindromePartition(String s, int idx, List<String> current, List<List<String>> ans){

        if(idx == s.length()) 
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = idx; i < s.length(); i++){

            if(isPalindrome(s, idx, i)){

                current.add(s.substring(idx, i+1));
                palindromePartition(s, i+1, current, ans);
                current.remove(current.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int i, int j){

        while(i <= j){
            
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}