public class pattern18 {
    /*                  E
                        DE
                        CDE
                        BCDE
                        ABCDE
                                           */
    public static void main(String[] args) {
        printPattern18(5);
        
    }
    public static void printPattern18(int n ){

        for(int i = 0 ; i < n ; i++){
            
            for(char ch = (char)('E' - i) ; ch <= 'E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
