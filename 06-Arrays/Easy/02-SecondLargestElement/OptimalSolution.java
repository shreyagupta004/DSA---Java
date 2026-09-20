

public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {2,3,78,7,3,6,99};

        int secLarge = secondLargest(arr);
        System.out.println("second largest element : " +secLarge);
    }
    public static int secondLargest(int arr[]){
         int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest ){
                secondLargest = largest;
                largest = arr[i] ;
                
            }
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
}
