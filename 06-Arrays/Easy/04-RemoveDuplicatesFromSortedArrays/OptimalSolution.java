public class OptimalSolution {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,4,4,5,6,};
        removeDuplicates(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int arr[]){

        int i = 0;
        for(int j = i + 1 ; j < arr.length ; j++){
            if(arr[j] != arr[i]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
