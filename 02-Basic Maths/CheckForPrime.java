public class CheckForPrime {
    public static void main(String[] args) {

        int num = 14;
        checkForPrime(num);
        
    }   
    public static void checkForPrime(int num){

        int count = 0;

        for(int i = 1 ; i <= num ; i++){
            
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
