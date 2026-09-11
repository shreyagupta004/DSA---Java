public class print1ToNUsingRecursion {
    public static void main(String[] args) {

         print1ToN(4, 9);
        backtrack(5, 5);        
    }
    public static void print1ToN(int i ,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print1ToN(i + 1, n);
    }

    //using backtracking-----
    public static void backtrack(int i , int n){
        if(i < 1){
            return;
        }
         backtrack(i - 1, n); 
             System.out.println(i); 
     }
}   