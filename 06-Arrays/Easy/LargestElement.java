public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1,5,2,7,8,9};
        int res = largestElement(arr);
        System.out.println(res);
        
    }
    public static int largestElement(int arr[]) {
        int largest = arr[0];
        for(int i = 0 ; i < arr.length  ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
