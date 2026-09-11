public class printNTo1UsingRecursion {
    public static void main(String[] args) {
        printNTo1(11, 1);
        backtrack(1, 5);
        
    }
    public static void printNTo1(int i , int n){
        if( i  < 1){
            return;
        }
        System.out.println(i);
        printNTo1(i - 1 , n) ;

    }
    //using backtracking---

    public static void backtrack(int i , int n){
        if(i > n){
            return;
        }
         backtrack(i + 1, n); 
             System.out.println(i); 
     }
}
