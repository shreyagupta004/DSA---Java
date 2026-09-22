public class OptimalSolution02 {
    public static void main(String[] args) {
         int num[] = {6,3,2,1,5,7,8};
        int res = missingNumber(num);
        System.out.println(res);
    }
    public static int missingNumber(int arr[]){

        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
            xor1 = xor1 ^ arr.length + 1;
        }
        int ans = xor1 ^ xor2;
        return ans;
    }
}
