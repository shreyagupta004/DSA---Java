

public class optimalSolution {
    public static void main(String args[]){
        int arr[] = {1,2,3,1,1,1,1,3,3};
        int ans = longestsubArray(arr, 6);
        System.out.println(ans);
    }
    public static int longestsubArray(int arr[] , int k){
        
        int left = 0;
        int right = 0;  
        int n = arr.length;
        int sum = arr[0];
        int maxLen = 0;
        while(right < n){

            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            
            if(sum == k){
                maxLen = Math.max(maxLen , right - left + 1 );
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
            
        }
        return maxLen;
    }
    
}
