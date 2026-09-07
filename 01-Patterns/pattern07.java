public class pattern07 {

/*                 *    
                  ***   
                 *****  
                ******* 
               *********           */

    public static void main(String[] args) {
        printPattern07(5);
        
    }
    public static void printPattern07(int n ){

        for(int i = 0 ; i < n ; i++){
            //space-----
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            //stars---
            for(int j = 0 ; j < i * 2 + 1 ; j++){
                System.out.print("*");
            }
            //space------
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
