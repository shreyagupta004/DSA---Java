import java.util.*;
public class f_01_AggressiveCows {
    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9};
        int res = AggressiveCows(arr, 4);
        System.out.println(res);
    }
    public static int AggressiveCows(int arr[], int k){
        Arrays.sort(arr);
        int low = 1, high = arr[arr.length - 1] - arr[0];
        while(low <= high){
            int mid = (low + high)/ 2;
            if(canWePlace(arr,mid,k) == true){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }

    public static boolean canWePlace(int arr[], int dist, int cows){
        int cowCnt = 1, last = arr[0]; 
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] - last >= dist){
                cowCnt++;
                last = arr[i];
            }
            if(cowCnt >= cows) return true;
        }
        return false;
    }
}
