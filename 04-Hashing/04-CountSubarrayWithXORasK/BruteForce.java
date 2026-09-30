public class BruteForce{
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        int ans = countSubarrayXOR(arr, 6);
        System.out.println(ans);
    }
    public static int countSubarrayXOR(int arr[] , int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int xor = 0;
                for(int k = i; k <= j; k++){
                    xor = xor ^ arr[k];
                }
                if(xor == target){
                    count++;
                }
            }
        }
        return count;
    }
}