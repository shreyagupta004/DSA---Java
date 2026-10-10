public class f_02_BookAllocationProblem{
    public static void main(String[] args) {
        int arr[] = {25,46,28,49,24};
        int res = findPages(arr, 4);
        System.out.println(res);
    }
    public static int findPages(int arr[], int m){

        if (m > arr.length)   return -1;
        
        int low = 0, high = 0;
        for(int n : arr){
            low = Math.max(low, n);
            high += n;
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(countStd(arr, mid) > m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int countStd(int arr[], int limit){
        int std = 1, page = 0;
        for(int i = 0; i < arr.length; i++){
            if(page + arr[i] > limit){
                std++;
                page = arr[i];
            }
            else{
                page += arr[i];
            }
        }
        return std;
    }
}