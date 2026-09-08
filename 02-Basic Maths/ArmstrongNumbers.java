public class ArmstrongNumbers {
    public static void main(String[] args) {

        int num = 153;
        armstrongNumber(num);
        
    }
    public static void armstrongNumber(int num){
        int originalNum = num;
        int sum = 0;
        
        while(num > 0){

            int rem = num % 10;
            sum  = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == originalNum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
