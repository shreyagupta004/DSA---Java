public class pattern12 {

/*                
                1        1
                12      21
                123    321
                1234  4321
                1234554321
                
                                    */
    public static void main(String[] args) {
        printPatter12(5);
        
    }
    public static void printPatter12(int n){

        for(int i = 1 ; i <= n ; i++){

            //for number---
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }

            //for space----
            for(int j = 1 ; j <=(2 * n) - (2 * i) ; j++){
                System.out.print(" ");
            }

            //for number---
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
