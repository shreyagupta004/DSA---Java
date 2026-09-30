public class BruteForce{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int ans = longestSubarray(arr, 3);
        System.out.println(ans);
    }
    public static int longestSubarray(int arr[] , int target){
        int len  = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = i ;j < arr.length ; j++){
                sum += arr[j];
                if(sum == target){
                    len = Math.max(j - i + 1 , len);
                }
            }
            
        }
        return len;
    }
}