public class pattern14 {
    /*
                        A
                        AB
                        ABC
                        ABCD
                        ABCDE
                                       */
    public static void main(String[] args) {
        printPattern14(5);
        
    }
    public static void printPattern14(int n){
         

        for(int i = 1 ; i <= n ; i++){

            for(char ch = 'A' ; ch < 'A' + i ; ch++){

                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
