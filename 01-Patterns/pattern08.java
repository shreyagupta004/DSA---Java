public class pattern08{

/*              *********
                 ******* 
                  *****  
                   ***   
                    *           */

    public static void main(String[] args) {
        printPattern08(5);
        
    }
    public static void printPattern08(int n){
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ;  j < i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * n - (2 * i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0 ;  j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}