public class pattern16 {
    /*                  A
                        BB
                        CCC
                        DDDD
                        EEEEE
                                              */
    public static void main(String[] args) {
        printPattern16(5);    

    }
    public static void printPattern16(int n){
        for(int i = 0 ; i < n ; i++){
            char ch = (char)('A' + i);
            for(int j = 0 ; j <= i ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }
}
