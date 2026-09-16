public class quickSorting {
    public static void main(String[] args) {

        int arr[] = {2,5,3,7,8,1,2,9};
        quickSort(arr, 0, arr.length - 1);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void quickSort(int arr[], int low, int high){
        
        if(low <= high){
            int partIdx = partition(arr, low, high);
            quickSort(arr, low, partIdx - 1);
            quickSort(arr, partIdx + 1, high);
        }
        

    }
    public static int partition(int arr[] , int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            return j;
         
    }
}
