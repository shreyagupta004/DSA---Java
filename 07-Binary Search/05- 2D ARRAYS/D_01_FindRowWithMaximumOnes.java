public class D_01_FindRowWithMaximumOnes {
    public static void main(String[] args) {
        int arr[][] = {{0,0,1,1,1},
                       {0,0,0,0,0},
                       {0,1,1,1,1},
                       {0,0,0,1,1},
                       {0,1,1,1,1}
                                         };
        int res = rowWithMaximumOnes(arr, arr.length, arr[0].length);
        System.out.println(res);                                
    }
    public static int rowWithMaximumOnes(int arr[][], int n, int m){
        int maxCount = 0;
        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            int cntOnes = m - lowerBound(arr[i], 1);
            if(cntOnes > maxCount){
                maxCount = cntOnes;
                idx = i;
            }
        }
        return idx;
    }
    public static int lowerBound(int arr[], int k){
        int low = 0,  high = arr.length - 1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}
