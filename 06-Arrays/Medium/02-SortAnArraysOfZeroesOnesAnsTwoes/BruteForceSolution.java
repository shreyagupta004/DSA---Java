import java.util.*;
public class BruteForceSolution{
    public static void main(String[] args) {
        int arr[] = { 0,1,2,0,1,2,1,2,0,0,0,1};
        sortArray(arr, 0, arr.length - 1);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortArray(int arr[], int low , int high){
        int mid = (low + high) / 2;
        sortArray(arr , 0 , mid);
        sortArray(arr, mid + 1 , high);
        merge(arr , low , mid , high);
    }
    public static void merge(int arr[] , int low , int mid , int high){
        List<Integer> list = new ArrayList<>();
        
        int i = low;
        int j = mid + 1;
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
             list.add(arr[i]);
                i++;
        }
        while(j <= high){
            list.add(arr[j]);
                j++;
        }
        for(int k = low ; k <= high ; k++){
            arr[i] = list.get(i - low);
        }

    }
}