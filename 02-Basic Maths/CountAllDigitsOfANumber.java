public class CountAllDigitsOfANumber {
    public static void main(String[] args) {

        int num = 68900;
        int res = countAllDigit(num);
        System.out.println(res);

        
    }
    public static int countAllDigit(int num){

        int count = 0;
        while(num > 0){
          //  int rem = num % 10 ;
            count ++;
            num = num / 10;
        }
        
        return count;
    }
}
