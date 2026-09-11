public class GCDOrHCF {
    public static void main(String[] args) {

        gcdOrhcf(12 , 24);

        gcd(52, 10);
        
    }
    public static void gcdOrhcf(int n1 , int n2){
        int gcd = 1;
        for(int i = 1 ; i <= Math.min(n1 , n2) ; i++){

            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        

    }
    //EUCLIDEAN ALGORITHM-----
    public static void gcd(int a , int b){

        while(a > 0 && b > 0){

            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a == 0){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
 