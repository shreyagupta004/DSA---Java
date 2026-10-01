public class SearchXinSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,13,19,20,26};
        int ans = binarySearch(arr, 20);
        System.out.println(ans);

        System.out.println(recursiveBinarySearch(arr, 0, arr.length - 1, 26));

    }
    public static int binarySearch(int arr[] , int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    //recursive implementation--
    public static int recursiveBinarySearch(int arr[] , int low , int high, int target){
        
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return recursiveBinarySearch(arr, mid + 1, high, target);
        }
        else{
            return recursiveBinarySearch(arr, low, mid - 1, target);
        }
    }
}
