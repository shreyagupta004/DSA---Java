public class pattern17 {

    /*                       A    
                            ABA   
                           ABCBA  
                          ABCDCBA 
                         ABCDEDCBA
                                                */
    public static void main(String[] args) {
        printPattern17(5);
        
    }
    public static void printPattern17(int n){
        for(int i = 0 ; i < n ; i++){
            //for space-----
            for(int j = 0 ; j <= n - i - 1 ; j++){
                System.out.print(" ");
            }

            //for characters-------
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for(int j = 1 ; j <= (2 * i + 1) ; j++){
                System.out.print(ch);
                
                if(j <= breakPoint ){
                    ch++;
                    
                }
                else{
                    ch--;
                }

            }

            //for space--------
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
