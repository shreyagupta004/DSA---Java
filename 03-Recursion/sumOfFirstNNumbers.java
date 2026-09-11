public class sumOfFirstNNumbers {
    public static void main(String[] args) {

        sumOfNNumbers(3,0) ;

        System.out.println(printSum(3));
    }
    //parameterized method----
    
    public static void sumOfNNumbers(int i , int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        } 
        
        System.out.println(sum);  
        
        sumOfNNumbers(i - 1 , sum + i) ;
    }
    
      //functional method-----
      
    public static int printSum(int n) {

        if(n == 0){
            return 0;
        }else{
            return n + printSum(n - 1);
        }
    }
 }
