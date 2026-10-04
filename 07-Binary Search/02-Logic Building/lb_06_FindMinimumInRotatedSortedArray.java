public class lb_06_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {5,4,0,1,2,3};
        int ans = findMinimum(arr);
        System.out.println(ans);
    }
    public static int findMinimum(int arr[]){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(arr[low] <= arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
