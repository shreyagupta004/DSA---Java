public class lb_01_InsertSearchPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7};
        int ans = insertSearchPosition(arr, 6);
        System.out.println(ans);
    }
    public static int insertSearchPosition(int arr[], int target){
        int low = 0, high = arr.length - 1, ans = arr.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= target){
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
