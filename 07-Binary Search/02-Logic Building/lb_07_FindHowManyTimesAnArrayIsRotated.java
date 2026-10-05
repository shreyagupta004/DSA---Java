public class lb_07_FindHowManyTimesAnArrayIsRotated{
    public static void main(String args[]){
        int arr[] = {3,4,5,1,2};
        int ans = NumberOfRotation(arr);
        System.out.println(ans);
    }
    public static int NumberOfRotation(int arr[]){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[low] <= arr[high]){
                index = low;
                ans = arr[low];
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                    
                }
                low = mid + 1;
            }
            else{
                if(arr[mid] <= arr[high]){
                    if(arr[mid] < ans){
                        index = mid;
                        ans = arr[mid];
                    }
                    high = mid - 1;
                }
            }
        }
        return index;
    }
}