import java.util.*;
public class OptimalSolution{
    
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        int ans = countInversion(arr);
        System.out.println(ans);
    }
    public static int countInversion(int arr[]){
        return mergeSort(arr, 0, arr.length - 1);
    }
    public static int mergeSort(int arr[] , int low , int high){
        int count = 0;
        int mid = (low + high) / 2;
        if(low >= high){
            return count;
        }
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public static int merge(int arr[] , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0 ;
        while(left <= mid && right <= high){
            
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while(left <= mid){
             temp.add(arr[left]);
                left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i - low);
        }
        return count;
    }
}