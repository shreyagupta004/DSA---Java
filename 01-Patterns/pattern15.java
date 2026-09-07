public class pattern15 {
    /*
                        ABCDE
                        ABCD
                        ABC
                        AB
                        A
                               */
    public static void main(String args[]){
        printPattern15(5);

    }
    public static void printPattern15(int n){
        for(int i = 0 ; i < n ; i++){

            for(char ch = 'A' ; ch <= 'A' + (n - i - 1) ; ch++){

                System.out.print(ch);
            }
            System.out.println();

        }

    }
    
}
