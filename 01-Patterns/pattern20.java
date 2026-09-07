public class pattern20 {
    /* 
                        *         *
                        **       **
                        ***     ***
                        ****   ****
                        ***** *****
                        ****   ****
                        ***     ***
                        **       **
                        *         *    
                                                      */
    public static void main(String[] args) {
        printPattern20(5);
        
    }
    public static void printPattern20(int n){
        int space = 2 * n - 2;
        for(int i = 1 ; i <= 2 * n - 1; i++){

            
             int stars = i;

                if(i > n){
                  stars = 2 * n - i;
                    
                }
                //star----
                for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }

            //space---
            for(int j = 0 ; j <= space ; j++){
                System.out.print(" ");

            }
            //stars---
             for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }
            if(i < n){
                space -= 2;
            }
            else{
                space += 2;
            }
            
            System.out.println();    

        }
        
    }
}
