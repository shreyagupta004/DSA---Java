public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {3,4,6,7,9,12,16,17};
        int ans = lowerBound(arr, 6);
        System.out.println(ans);
    }
    public static int lowerBound(int arr[] , int target){
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
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
