public class lb_02_FloorAndCeilInSortedArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int ans = floor(arr , 25);
        System.out.println( "floor value : "+ans);
        int res = ceil(arr, 25);
        System.out.println("ceil value : "+res);
    }
    public static int floor(int arr[] , int target){
        int low = 0, high = arr.length - 1, ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int ceil(int arr[], int target) {

    int low = 0, high = arr.length - 1;
    int ans = -1;

    while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] >= target) {
            ans = arr[mid];
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    return ans;
}
}
