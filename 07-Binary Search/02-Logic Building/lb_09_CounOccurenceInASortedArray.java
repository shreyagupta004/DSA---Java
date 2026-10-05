public class lb_09_CounOccurenceInASortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,8,8,8,8,9};
        int ans = count(arr, 8);
        System.out.println(ans);
    }
    
    public static int count(int arr[],int target){
            int first = first(arr, target);
            if(first == -1){
                return 0;
            }
            int last = last(arr, target);
            return last - first + 1;
    }
    public static int first(int arr[] , int target){
        int first = -1;
        int low = 0 , high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;     
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
    public static int last(int arr[] , int target){
        int low = 0, high = arr.length - 1;
        int last = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            
        }
        return last;
    }
}
