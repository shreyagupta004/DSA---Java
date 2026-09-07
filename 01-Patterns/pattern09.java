public class pattern09 {


 /*                             *
                               ***
                              *****
                             *******
                            *********
                            *********
                             *******
                              *****  
                               ***   
                                *                  */

    public static void main(String[] args) {

    printPattern09(5);        
    }
    public static void printPattern09(int n ){
        for(int i = 0 ; i < n ; i++){
            
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            } 
            
            for(int j = 0 ; j < i * 2 + 1 ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * n - (2 * i + 1) ; j++){
                System.out.print("*");
            } 
             for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}