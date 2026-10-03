public class lb_05_SearchInRotatedSortedArrayTwo {
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        System.out.println(6);
    }
    public static boolean search(int arr[], int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low + 1;
                high = high + 1;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target <= arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }      
            }
            else{
                if(target >= arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
