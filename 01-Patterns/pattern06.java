public class pattern06 {

 /*             12345
                1234
                123
                12
                1      */
                
    public static void main(String[] args) {
        printPattern05(5);
        
    }
    public static void printPattern05(int n){

        for(int i = 1 ; i <= n ; i++){

            for(int j = 1 ; j <= n - i + 1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
