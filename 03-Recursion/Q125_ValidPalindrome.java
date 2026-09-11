public class Q_125_ValidPalindrome{
    public static void main(String args[]){
        String s = "race a car";
        s = s.replaceAll("[^a-zA-Z0-9]" ,"").toLowerCase();
        System.out.println(ispalindrome(0, s.length() - 1, s));
    }
    public static boolean ispalindrome(int l , int r , String s){
        if(l >= r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return ispalindrome(l + 1, r - 1, s);
    }
}