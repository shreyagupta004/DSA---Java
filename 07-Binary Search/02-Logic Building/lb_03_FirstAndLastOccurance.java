import java.util.*;

public class lb_03_FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[] = {1,2,8,8,8,8,9};
        lb_03_FirstAndLastOccurance obj = new lb_03_FirstAndLastOccurance();
        List<Integer> ans = obj.firstAndLastOccurance(arr, 8);
        System.out.println(ans);
    }
   public static List<Integer> firstAndLastOccurance(int arr[] , int target){
    int first = firstOccurance(arr, target);
    if(first == -1){
        return Arrays.asList(-1 , -1);
    }
    int last = lastOccurance(arr, target);
    return Arrays.asList(first , last);
   } 
   public static int firstOccurance(int arr[] , int target){
    int low = 0, high = arr.length - 1;
    int first = -1;
    while(low <= high){
        int mid = (low + high) / 2;
        if(arr[mid] == target){
            first = mid;
            high = mid - 1;
        }
        else if (arr[mid] < target){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    return first;
   }

   public static int lastOccurance(int arr[], int target){
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
            high = mid -1;
        }
    }
    return last;
   }
}
