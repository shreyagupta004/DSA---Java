import java.util.*;

/*               
        * 
        * * 
        * * * 
        * * * * 
        * * * * *        */ 

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of test Cases:");
        int t = sc.nextInt() ;
        
        for(int i = 0 ; i < t ; i++){
            System.out.print("enter n :");
            int n = sc.nextInt();
            
            printPatter02(n);
        }
        
    }
    public static void printPatter02(int n){

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j <= i ;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
