public class pattern19 {

    /*                      **********
                            ****  ****
                            ***    ***
                            **      **
                            *        *
                            *        *
                            **      **
                            ***    ***
                            ****  ****
                            **********
                                                     */
    public static void main(String[] args) {
        printPattern19(5);
        
    }
    public static void printPattern19(int n){

        int space = 0;

        for(int i = 0 ; i < n ; i++){

            //for stars---
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("*");
            }
            
            //for space----
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");

            }

            //for stars--
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("*");
            }
            space = space + 2;
            System.out.println();
            

        } 
         space = 2 * n - 2; 
        for(int i = 0 ; i < n ; i++){

            //stars-----
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }

            //space----
            for(int j = 0 ; j < space ; j++){
                System.out.print(" ");

            }

            //stars-----
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }

            space -= 2;
            System.out.println();
        }
        
    }
}
