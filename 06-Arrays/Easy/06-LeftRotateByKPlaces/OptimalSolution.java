

public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
         leftRotateByD(arr , 4);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " " );
        }

    }
    public static int[] leftRotateByD(int arr[] , int d){
        
        reverse(arr , 0 , d - 1);
        reverse(arr , d  , arr.length - 1);
        reverse(arr , 0 , arr.length - 1);
        return arr;
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
