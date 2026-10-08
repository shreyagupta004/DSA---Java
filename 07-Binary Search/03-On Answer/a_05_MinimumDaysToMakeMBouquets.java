public class a_05_MinimumDaysToMakeMBouquets{
    public static void main(String[] args) {
        int arr[] = {7,7,7,7,13,11,12,7};
        int res = bouquet(arr, 2, 3);
        System.out.println(res);
    }
    public static boolean possible(int arr[], int day, int m, int k){
        int count = 0,  noOfB = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                noOfB += count/k;
                count = 0;
            }
        } 
        noOfB += count/k ;
        if(noOfB >= m) return true;
        else{
           return false;
        }
    }
    public static int bouquet(int arr[], int m, int k){
        int low = 0, high = 0;
        for(int num : arr){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(possible(arr, mid, m, k) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}