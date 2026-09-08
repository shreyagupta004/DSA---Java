public class PrintAllDivisors {
    public static void main(String[] args) {
        int num = 24;
        printAllDivisors(num);
        
    }
    public static void printAllDivisors(int num){
        
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
