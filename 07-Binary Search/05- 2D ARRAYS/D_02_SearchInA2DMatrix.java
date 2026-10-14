public class D_02_SearchInA2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        // boolean res = search(arr, 25);
        // System.out.println(res);
        boolean ans = searchin2DMatrix(arr, 10);
        System.out.println(ans);
    }

    public static  boolean search(int arr[][], int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i][0] <= k && k <= arr[i][arr.length - 1]){
                return binarySearch(arr[i], k);
            }
        }
        return false;
    }
    public static boolean binarySearch(int arr[], int k){
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }

    //optimal
    public static boolean searchin2DMatrix(int arr[][], int target){
        int n = arr.length;
        int m = arr[0].length;
        int low = 0, high = (m * n) - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if(arr[row][col] == target) return true;
            else if(arr[row][col] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
