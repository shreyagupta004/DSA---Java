public class pattern10 {
     /*                 
                    *
                    **
                    ***
                    ****
                    *****
                    ****
                    ***
                    **
                    *                   
                                               */
    public static void main(String[] args) {
        printPattern10(5);
        
    }
    public static void printPattern10(int n){

        for(int i = 1 ; i <= 2 * n - 1 ; i++){
            int stars = i;
            if(i > n ){
              stars  = 2 * n - i;
            }
            for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
