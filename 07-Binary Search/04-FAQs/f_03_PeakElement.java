public class f_03_PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1};
        int res = peakElement(arr);
        System.out.println(res);
    }
    public static int peakElement(int arr[]){
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] > arr[1])  return 0;
        if(arr[n-1] > arr[n-2])  return n-1;
        int low = 1, high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                low = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                high = mid - 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
