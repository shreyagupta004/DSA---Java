public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void nextPermutation(int arr[]){
        int idx = -1;
        int n = arr.length;

        for(int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] < arr[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr , 0 , n - 1);
            return;
        }
        for(int i = n - 1 ; i > idx ; i++){
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        reverse(arr , idx + 1 , n - 1);
    }
    public static void reverse(int arr[] , int i , int j){
         
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
