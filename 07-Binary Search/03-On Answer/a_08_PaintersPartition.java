public class a_08_PaintersPartition {
    public static void main(String[] args) {
        int arr[] = {25,46,28,49,24};
        int ans = splitArray(arr, 4);
        System.out.println(ans);
    }
    public static int splitArray(int nums[], int m){
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(countStd(nums, mid) > m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int countStd(int arr[], int limit){
        int std = 1, pages = 0;
        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= limit){
                pages += arr[i];
            }
            else{
                std++;
                pages = arr[i];
            }
        }
        return std;
    }
}
