public class BruteForceSolution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 3;
        leftRotate(arr, d);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " " );
        } 
    }
    public static void leftRotate(int arr[] , int d){
        int temp [] = new int[d];

        //put values to temp-----
        for(int i = 0 ; i < d ; i++){
            temp[i] = arr[i];
        } 

        //shifting---
        for(int i = d ; i < arr.length ; i++){
            arr[i - d] = arr[i];
        }

        //put back temp ----
        for(int i = arr.length - d ; i < arr.length ; i++){
            arr[i] = temp[i - (arr.length - d)];
        }
    }
    
}
