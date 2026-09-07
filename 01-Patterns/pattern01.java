
// pattern for ----
/*      *  *  *  *  * 
        *  *  *  *  * 
        *  *  *  *  * 
        *  *  *  *  *  
        *  *  *  *  *      */
public class pattern01 {
    public static void main(String[] args) {
         
        printPattern01(5); 
    
    }
    public static void printPattern01(int n){
        

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n ; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
